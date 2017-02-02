package com.user;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.data.DataHelper;
import com.data.ReportHelper;
import com.data.sale.SaleData;
import com.data.sale.SaleManager;
import com.ly.tool.emailTool.EmailData;
import com.ly.tool.emailTool.EmailSender;
import com.sql.mapperBean.TLandId;
import com.sql.mapperBean.TMenuLine;
import com.sql.mapperBean.TMonegChange;
import com.unit.Tool;
import com.user.MonthReport.MoneyChangeData;

import javafx.scene.chart.PieChart.Data;

public class DataReport {
	public static DataReport instance = new DataReport();

	private EmailSender emailSender;

	private DataReport() {
	}

	public void init() {
		try {
			String name = DataHelper.instance.getTitleData("email_name").getnValue();
			String passw = DataHelper.instance.getTitleData("email_passw").getnValue();
			String host = DataHelper.instance.getTitleData("email_host").getnValue();
			emailSender = new EmailSender(name, passw, host);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public boolean sendLandOutReport(TLandId landId, TMonegChange monegChange, float money_need, float money_true) {
		if (emailSender == null) {
			init();
		}
		if (emailSender == null)
			return false;
		try {

			String addrs = DataHelper.instance.getTitleData("email_send_addrs").getnValue();
			EmailData data = new EmailData(addrs);

			data.title = "收班汇报：" + new Date().toLocaleString();

			StringBuffer sb = new StringBuffer();
			sb.append("班次：").append(landId.getLandId()).append("  时间：").append(landId.getLandTime().toLocaleString())
					.append("\r\n");
			sb.append("登陆信息：").append(landId.getLandInfo()).append("\r\n");
			sb.append("应有金钱").append(money_need).append("实际金钱:").append(money_true).append("差异：")
					.append(money_true - money_need).append("\r\n");
			sb.append("销售汇报：").append("\r\n");

			Map<Long, SaleData> saleDataMap = SaleManager.instance.getSaleInfo(LandManager.instance.landId.getLandId());

			float all = 0;

			for (SaleData saleData : saleDataMap.values()) {
				sb.append(saleData.saleType).append(":").append(saleData.money).append("\r\n");
				if (!saleData.saleType.contains("会员支付"))
					all += saleData.money;

			}

			sb.append("总额：：").append(all).append("\r\n");

			try {
				List<TMonegChange> changs = MoneyManager.instance.getMoneyChangeList(landId);
				for (TMonegChange c : changs) {
					try {
						JSONObject jb = JSON.parseObject(c.getTip());
						if (landId.getLandId().equals(jb.getInteger("landId"))) {
							sb.append(c.getChangeUser()).append(":").append(c.getMoneyChangeTypeName()).append("  金额：")
									.append(c.getMoneyChange()).append(" 时间：")
									.append(Tool.dateFormat.format(c.getTime())).append("\r\n");
						}
					} catch (Exception e) {
						// TODO: handle exception
					}

				}
			} catch (Exception e) {
			}

			data.data = sb.toString();
			emailSender.send(data);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;

	}

	public boolean sendLandReport(TLandId landId, TMonegChange monegChange, float moneyDif) {
		if (emailSender == null) {
			init();
		}
		if (emailSender == null)
			return false;
		try {

			String addrs = DataHelper.instance.getTitleData("email_send_addrs").getnValue();
			EmailData data = new EmailData(addrs);

			data.title = "开班汇报：" + new Date().toLocaleString();

			StringBuffer sb = new StringBuffer();
			sb.append("班次：").append(landId.getLandId()).append("  时间：").append(landId.getLandTime().toLocaleString())
					.append("\r\n");
			sb.append("登陆信息：").append(landId.getLandInfo()).append("\r\n");
			sb.append("上班钱箱金钱：").append(monegChange.getMoneyFinish()).append("\r\n");
			sb.append("差异汇报：").append(moneyDif).append("\r\n");
			data.data = sb.toString();
			emailSender.send(data);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;
	}
}
