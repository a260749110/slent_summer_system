package com.user;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.Config;
import com.data.DataHelper;
import com.ly.tool.emailTool.EmailData;
import com.ly.tool.emailTool.EmailSender;
import com.report.MonthlyReport;
import com.sql.mapperBean.TMonegChange;
import com.sql.mapperBean.TSilemtSummerSellInfo;

public class MonthReport {
	public int month;
	public Timestamp dateStart = new Timestamp(System.currentTimeMillis());
	public Timestamp dateEnd = new Timestamp(System.currentTimeMillis());
	public static Random random = new Random();
	public String fileName = "";
	private SimpleDateFormat dateFormat;

	public MonthReport(int month) {
		fileName = "d:/" + month + "月报告_" + random.nextInt() + ".xls";
		dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		this.month = month;
		dateStart.setHours(7);
		dateStart.setDate(1);
		dateStart.setMonth(month - 1);

		dateEnd.setHours(7);
		dateEnd.setDate(1);
		dateEnd.setMonth(month);

	}

	private WritableWorkbook workbook;
	private WritableSheet moneyChangeSheet;
	private WritableSheet moneyDifSheet;
	private WritableSheet moneyPortSheet;
	private WritableSheet payfSheet;
	private WritableSheet deleteSellSheet;
	private WritableSheet landReportSheet;
	public void init() throws Exception {
		workbook = Workbook.createWorkbook(new File(fileName));

		moneyChangeSheet = workbook.createSheet("现金报表", 0);
		moneyDifSheet = workbook.createSheet("交班金钱差异报表", 1);
		moneyPortSheet= workbook.createSheet("交班缺钱报表", 2);
		payfSheet = workbook.createSheet("支付情况", 3);
		deleteSellSheet= workbook.createSheet("退单情况", 4);
		landReportSheet=workbook.createSheet("班次信息", 5);
		// Label label = new Label(1,1,"测试");
		// ws.addCell(label);
		initMoneyChangData();
		initPayInfo();
		MonthlyReport monthlyReport=new MonthlyReport(month);
		monthlyReport.fillSheet(workbook, 6);
		workbook.write();
		workbook.close();
	}
public void out()
{
	 String name=DataHelper.instance.getTitleData("email_name").getnValue();
	 String passw=DataHelper.instance.getTitleData("email_passw").getnValue();
	 String host=DataHelper.instance.getTitleData("email_host").getnValue();
	 EmailSender	 emailSender =new EmailSender(name, passw, host);	
	 EmailData emailData=new EmailData( DataHelper.instance.getTitleData("email_send_addrs").getnValue());
	 emailData.title  = month+  "月月报";
	 emailData.data=month+  "月月报";
	 emailData.files.put(fileName, new File(fileName));
	 
	 emailSender.send(emailData);
}
	
	private void initMoneyChangData() throws Exception {
		List<TMonegChange> dataList = MonthDataManager.instance
				.getMoneyChangeManeger(month);

		Map<String, Map<String, MoneyChangeData>> payMap = new HashMap<String, Map<String, MoneyChangeData>>();

		Label label_dif = new Label(0, 0, "时间");
		Label label_value = new Label(1, 0, "金额");
		Label label_men = new Label(2, 0, "责任人");
		moneyDifSheet.addCell(label_dif);
		moneyDifSheet.addCell(label_value);
		moneyDifSheet.addCell(label_men);
		Label label_dif1 = new Label(0, 0, "时间");
		Label label_value1 = new Label(1, 0, "金额");
		Label label_men1 = new Label(2, 0, "责任人");
		moneyPortSheet.addCell(label_dif1);
		moneyPortSheet.addCell(label_value1);
		moneyPortSheet.addCell(label_men1);
		for (TMonegChange data : dataList) {
			testMoneyChange(data);
			Map<String, MoneyChangeData> useData = payMap.get(data
					.getMoneyChangeTypeName());
			if (useData == null) {
				useData = new HashMap<>();
				payMap.put(data.getMoneyChangeTypeName(), useData);
			}
			MoneyChangeData mouthData = useData.get(data.getChangeUser());
			if (mouthData == null) {
				mouthData = new MoneyChangeData();
				useData.put(data.getChangeUser(), mouthData);
			}
			mouthData.money += data.getMoneyChange();
			//System.err.println(Config.DATEFORMAT.format(data.getTime()));
		}
		int i = 1;
		Label label_name = new Label(0, 0, "名称：");
		Label label_user = new Label(1, 0, "修改人：");
		Label label_money = new Label(2, 0, "金额：");
		moneyChangeSheet.addCell(label_name);
		moneyChangeSheet.addCell(label_user);
		moneyChangeSheet.addCell(label_money);
		for (String key1 : payMap.keySet()) {

			for (String k2 : payMap.get(key1).keySet()) {

				MoneyChangeData mouthData = payMap.get(key1).get(k2);
				System.err.println(key1 + "  " + k2 + "  " + mouthData.money);
				Label labelTemp1 = new Label(0, i, key1);

				Label labelTemp2 = new Label(1, i, k2);
				Label labelTemp3 = new Label(2, i, mouthData.money + "");
				moneyChangeSheet.addCell(labelTemp1);
				moneyChangeSheet.addCell(labelTemp2);
				moneyChangeSheet.addCell(labelTemp3);
				i++;
			}
			i++;
		}

	}

	private void testMoneyChange(TMonegChange change) throws Exception {
		if (change.getMoneyChangeType() == 3) {
			addMoneyDifClassChange(change);
		}
		else if(change.getMoneyChangeType() == 1)
		{
			addMoneyPortClassChange(change);
		}
	}

	private int moneyDifLineNum = 1;

	private void addMoneyDifClassChange(TMonegChange change) throws Exception {
	
		if(change.getMoneyChange()>=0)
			return ;
		Label label1 = new Label(0, moneyDifLineNum, dateFormat.format(change
				.getTime()));
		moneyDifSheet.addCell(label1);
		Label label2 = new Label(1, moneyDifLineNum, change.getMoneyChange()
				+ "");
		moneyDifSheet.addCell(label2);
		try {
			JSONObject jb = new JSONObject(change.getTip());
			JSONArray jl = jb.getJSONArray("onduty_list");
			String str = "";

			for (int i = 0; i < jl.length(); i++) {
				if (!str.isEmpty()) {
					str += ",";
				}
				str += jl.getJSONObject(i).getString("id");

			}
			Label label3 = new Label(2, moneyDifLineNum, str);
			moneyDifSheet.addCell(label3);
		} catch (Exception e) {
			// TODO: handle exception
		}

		moneyDifLineNum++;
	}
	int protIndex=1;
	private void addMoneyPortClassChange(TMonegChange change) throws Exception {
		
		if(change.getMoneyChange()>=0)
			return ;
		Label label1 = new Label(0, protIndex, dateFormat.format(change
				.getTime()));
		moneyPortSheet.addCell(label1);
		Label label2 = new Label(1, protIndex, change.getMoneyChange()
				+ "");
		moneyPortSheet.addCell(label2);
		try {
			JSONObject jb = new JSONObject(change.getTip());
			
			Label label3 = new Label(2, protIndex, jb.getString("erroUser"));
			moneyPortSheet.addCell(label3);
		} catch (Exception e) {
			// TODO: handle exception
			
		}

		protIndex++;
	}
	private void initPayInfo() throws Exception {
		Label label_name = new Label(0, 0, "名称：");

		Label label_money = new Label(1, 0, "金额：");
		payfSheet.addCell(label_name);
		payfSheet.addCell(label_money);
	List<TSilemtSummerSellInfo> sellInfoList=DataHelper.instance.getSellInfosByTime(dateStart, dateEnd);
	Map<String, Float> payTypeMap=new HashMap<>();
	for(TSilemtSummerSellInfo info:sellInfoList)
	{
		if(info.getDeleteFlag())
		{
			addDeleteSell(info);
			continue;
		}
		Float f=payTypeMap.get(info.getPayName());
		if(f==null)
		{
			f=0f;
			
		}
		payTypeMap.put(info.getPayName(), f+info.getMoneyTrue());
	}
	int i=1;
	for(String key:payTypeMap.keySet())
	{
		
		Label label1 = new Label(0, i, key	);

		Label label2 = new Label(1, i, payTypeMap.get(key)+"");
		payfSheet.addCell(label1);
		payfSheet.addCell(label2);
		i++;
	}
	}
	private int deleLineIndex=1;
private void addDeleteSell(TSilemtSummerSellInfo info) throws Exception
{
	Label label_name = new Label(0, 0, "名称：");

	Label label_money = new Label(1, 0, "金额：");
	Label label_payType = new Label(2, 0, "支付方式：");
	Label label_time = new Label(3, 0, "时间：");
	deleteSellSheet.addCell(label_name);
	deleteSellSheet.addCell(label_money);
	deleteSellSheet.addCell(label_time);
	deleteSellSheet.addCell(label_payType);
	
	Label label_named = new Label(0, deleLineIndex,info.getSellName());

	Label label_moneyd = new Label(1, deleLineIndex, info.getMoneyTrue()+"");
	Label label_payTyped = new Label(2, deleLineIndex, info.getPayName());
	Label label_timed = new Label(3, deleLineIndex, Config.DATEFORMAT.format(info.getTime()));
	deleteSellSheet.addCell(label_named);
	deleteSellSheet.addCell(label_moneyd);
	deleteSellSheet.addCell(label_timed);
	deleteSellSheet.addCell(label_payTyped);
	deleLineIndex++;
	
	
	}
	public static class MoneyChangeData {
		public float money = 0;

	}

}
