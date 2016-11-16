package com.report;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;

import com.Config;
import com.data.DataHelper;
import com.report.ClassReport.OndutyData;
import com.report.enumCells.EMoneyChangeType;
import com.sql.MyBatisManager;
import com.sql.mapper.TLandIdMapper;
import com.sql.mapper.TMonegChangeMapper;
import com.sql.mapperBean.SVip;
import com.sql.mapperBean.TLandId;
import com.sql.mapperBean.TLandIdExample;
import com.sql.mapperBean.TMonegChange;
import com.sql.mapperBean.TMonegChangeExample;
import com.sql.mapperBean.TSilemtSummerSellInfo;
import com.sql.mapperBean.TUser;
import com.user.UserManager;
import com.user.vip.SSVipManager;

import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class MonthlyReport {
	private List<TLandId> landList;
	private Map<Integer, ClassReport> classReportMap;
	private List<ClassReport> classReportList;
	private Map<Integer, TMonegChange> changeMap;

	public MonthlyReport(int month) {
		landList = getLandList(month);
		classReportMap = new HashMap<Integer, ClassReport>();
		classReportList = new ArrayList<>();
		if (landList != null) {
			for (TLandId land : landList) {
				ClassReport dayReport = new ClassReport(land);

				classReportMap.put(land.getLandId(), dayReport);

				classReportList.add(dayReport);
			}
		}
		List<TMonegChange> moneyChangs = getMoneyChangeManeger(month);
		changeMap = new HashMap<>();
		if (moneyChangs != null) {
			for (TMonegChange change : moneyChangs) {
				changeMap.put(change.getId(), change);

			}
			for (TMonegChange change : moneyChangs) {

				processingMonetChange(change);
			}
		}

		if (classReportMap != null) {
			for (ClassReport classReport : classReportMap.values()) {
				vipMoneyHandler(classReport);

			}
		}
		System.err.println("end");
	}

	private void vipMoneyHandler(ClassReport classReport) {

		List<TSilemtSummerSellInfo> list = DataHelper.instance
				.getSellInfosByVipRechargeAndLandId(classReport.getLandId().getLandId());
		System.err.println("id:" + classReport.getLandId().getLandId() + "  size :" + list.size());
		List<OndutyData> ondutyDatas = classReport.getOndutyList();
		if (ondutyDatas.size() == 0) {
			System.err.println(classReport.getLandId().getLandId());
		}
		if (list != null && list.size() > 0 && ondutyDatas != null && ondutyDatas.size() > 0) {
			float size = ondutyDatas.size();
			float all = 0;

			for (TSilemtSummerSellInfo info : list) {
				all += info.getMoneyTrue();
			}
			for (OndutyData ondutyData : ondutyDatas) {
				ondutyData.setVipMoney(ondutyData.getVipMoney() + all / size);
				// System.err.println(ondutyData.getName() +"
				// :"+ondutyData.getVipMoney());
			}
		}

	}

	private void processingMonetChange(TMonegChange change) {
		EMoneyChangeType type = EMoneyChangeType.getById(change.getMoneyChangeType());
		switch (type) {
		case CASH: {
			moneyChange_cash_handler(change);
		}
			break;

		case CASH_DIF: {
			moneyChange_cash_dif_handler(change);
		}
			break;
		case CLASSES_CASH_CHANGE: {
			moneyChange_classes_cash_change_handler(change);
		}
			break;
		case CLASSES_CASH_DIF: {
			moneychange_classes_cash_dif_handler(change);
		}
			break;
		case PURCHASE: {
			moneyChange_cash_purchase_handler(change);
		}
			break;
		case RECORDING: {
			moneychange_cash_recording_handler(change);
		}
			break;
		case DIVIDEND: {
			moneychange_cash_dividend_handler(change);
		}
			break;
		default:
			break;
		}
	}

	/**
	 * 现金收入
	 * 
	 * @param change
	 */
	private void moneyChange_cash_handler(TMonegChange change) {

	}

	/**
	 * 交班金钱差补举报
	 * 
	 * @param change
	 */
	private void moneyChange_cash_dif_handler(TMonegChange change) {

		try {
			JSONObject tip = new JSONObject(change.getTip());
			TMonegChange difChange = null;
			if (tip != null) {
				difChange = changeMap.get(tip.getInt("erroID"));
				if (difChange != null && difChange.getMoneyChange() < 0) {
					JSONObject tip2 = new JSONObject(difChange.getTip());
					ClassReport classReport = classReportMap.get(tip2.getInt("landId"));
					if (classReport != null) {
						List<OndutyData> list = classReport.getOndutyList();
						float size = list.size();
						if (size != 0) {
							for (OndutyData ondutyData : list) {
								ondutyData.setDifMoney(ondutyData.getDifMoney() + change.getMoneyChange() / size);
							}
						}

						try {
							String tipMsg = tip.getString("tip");
							classReport.setTip(tipMsg + " 。");
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * 交班现金录入
	 * 
	 * @param change
	 */
	private void moneyChange_classes_cash_change_handler(TMonegChange change) {

		// if(change==null||change.getMoneyChange()>=0)
		// return;
		// try {
		// JSONObject tip=new JSONObject(change.getTip());
		// ClassReport classReport=classReportMap.get(tip.get("landId"));
		// List<OndutyData> ondutylist=classReport.getOndutyList();
		// float size=ondutylist.size();
		// if(size>0)
		// {
		// classReport.setMoeny_dif(classReport.getMoeny_dif()+change.getMoneyChange()/size);
		// }
		// classReport.setTip(tip.getString("tip")+ " 。" );
		// } catch (Exception e) {
		// // TODO: handle exception
		// e.printStackTrace();
		// }

	}

	/**
	 * 交班现金差录入
	 * 
	 * @param change
	 */
	private void moneychange_classes_cash_dif_handler(TMonegChange change) {

		if (change == null || change.getMoneyChange() >= 0)
			return;
		try {
			JSONObject tip = new JSONObject(change.getTip());
			ClassReport classReport = classReportMap.get(tip.get("landId"));
			if (classReport == null)
				System.err.println("classReport null");
			List<OndutyData> ondutylist = classReport.getOndutyList();
			float size = ondutylist.size();
			if (size > 0) {
				for (OndutyData ondutyData : ondutylist) {
					ondutyData.setDifMoney(ondutyData.getDifMoney() + change.getMoneyChange() / size);
				}
			}
			try {
				classReport.setTip(tip.getString("tip") + "  。");
			} catch (Exception e) {
				// TODO: handle exception

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/**
	 * 入货
	 * 
	 * @param change
	 */
	private void moneyChange_cash_purchase_handler(TMonegChange change) {
		TUser tUser = UserManager.instance.getUser(change.getChangeUser());

		if (change == null )
			return;
		try {
			JSONObject tip = new JSONObject(change.getTip());
			ClassReport classReport = classReportMap.get(tip.get("landId"));
			if (classReport == null)
				System.err.println("classReport null");
			List<OndutyData> ondutylist = classReport.getOndutyList();
			float size = ondutylist.size();
			if (size > 0) {
				for (OndutyData ondutyData : ondutylist) {
					if (ondutyData.getId().equals(tUser.getName())) {
						ondutyData.setPurchaseMoney(ondutyData.getPurchaseMoney() + change.getMoneyChange());
					}
				}
			}
			try {
				classReport.setTip(tip.getString("tip") + "  。");
			} catch (Exception e) {
				// TODO: handle exception

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/**
	 * 入账
	 * 
	 * @param change
	 */
	private void moneychange_cash_recording_handler(TMonegChange change) {
		TUser tUser = UserManager.instance.getUser(change.getChangeUser());

		if (change == null)
			return;
		try {
			JSONObject tip = new JSONObject(change.getTip());
			ClassReport classReport = classReportMap.get(tip.get("landId"));
			if (classReport == null)
				System.err.println("classReport null");
			List<OndutyData> ondutylist = classReport.getOndutyList();
			float size = ondutylist.size();
			if (size > 0) {
				for (OndutyData ondutyData : ondutylist) {
					if (ondutyData.getId().equals(tUser.getName())) {
						ondutyData.setRecordingMoney(ondutyData.getRecordingMoney() + change.getMoneyChange());
					}
				}
			}
			try {
				classReport.setTip(tip.getString("tip") + "  。");
			} catch (Exception e) {
				// TODO: handle exception

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	

	}

	/**
	 * 分红
	 * 
	 * @param change
	 */
	private void moneychange_cash_dividend_handler(TMonegChange change) {
		TUser tUser = UserManager.instance.getUser(change.getChangeUser());

		if (change == null )
			return;
		try {
			JSONObject tip = new JSONObject(change.getTip());
			ClassReport classReport = classReportMap.get(tip.get("landId"));
			if (classReport == null)
				System.err.println("classReport null");
			List<OndutyData> ondutylist = classReport.getOndutyList();
			float size = ondutylist.size();
			if (size > 0) {
				for (OndutyData ondutyData : ondutylist) {
					if (ondutyData.getId().equals(tUser.getName())) {
						ondutyData.setDividendMoney(ondutyData.getDividendMoney() + change.getMoneyChange());
					}
				}
			}
			try {
				classReport.setTip(tip.getString("tip") + "  。");
			} catch (Exception e) {
				// TODO: handle exception

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	

	}

	private List<TLandId> getLandList(int month) {

		SqlSession session = MyBatisManager.instance.getSession();
		TLandIdMapper changeMapper = session.getMapper(TLandIdMapper.class);

		TLandIdExample example = new TLandIdExample();
		Timestamp dateStart = new Timestamp(System.currentTimeMillis());
		Timestamp dateEnd = new Timestamp(System.currentTimeMillis());
		dateStart.setHours(7);
		dateStart.setDate(1);
		dateStart.setMonth(month - 1);

		dateEnd.setHours(7);
		dateEnd.setDate(1);
		dateEnd.setMonth(month);
		System.err.println(Config.DATEFORMAT.format(dateStart));
		System.err.println(Config.DATEFORMAT.format(dateEnd));
		example.createCriteria().andLandTimeBetween(dateStart, dateEnd);
		List<TLandId> list = changeMapper.selectByExampleWithBLOBs(example);

		session.close();
		return list;
	}

	private List<TMonegChange> getMoneyChangeManeger(int month) {

		SqlSession session = MyBatisManager.instance.getSession();
		TMonegChangeMapper changeMapper = session.getMapper(TMonegChangeMapper.class);

		TMonegChangeExample example = new TMonegChangeExample();
		Timestamp dateStart = new Timestamp(System.currentTimeMillis());
		Timestamp dateEnd = new Timestamp(System.currentTimeMillis());
		dateStart.setHours(7);
		dateStart.setDate(1);
		dateStart.setMonth(month - 1);

		dateEnd.setHours(7);
		dateEnd.setDate(1);
		dateEnd.setMonth(month);
		System.err.println(Config.DATEFORMAT.format(dateEnd));
		example.createCriteria().andTimeBetween(dateStart, dateEnd);
		List<TMonegChange> list = changeMapper.selectByExampleWithBLOBs(example);

		session.close();
		return list;
	}

	public void fillSheet(WritableWorkbook workbook, int start) {
		Map<String, Cell> sheetMap = new HashMap<>();
		int sheetNow = start;
		for (int i = 0; i < classReportList.size(); i++) {
			ClassReport classReport = classReportList.get(i);

			List<OndutyData> ondutyDatas = classReport.getOndutyList();
			if (ondutyDatas != null) {
				for (OndutyData data : ondutyDatas) {
					Cell cell = sheetMap.get(data.getId());
					if (cell == null) {
						cell = new Cell();
						cell.sheet = workbook.createSheet(data.getId(), sheetNow);
						sheetNow++;
						cell.strs = new String[8][classReportList.size() + 2];
						cell.strs[0][0] = "时间";
						cell.strs[0][1] = "合计";
						cell.strs[1][0] = "签到时间";
						cell.strs[2][0] = "VIP 提成";
						cell.strs[3][0] = "交班金钱缺失";
						cell.strs[4][0] = "分红";
						cell.strs[5][0] = "入货";
						cell.strs[6][0] = "入账";
						cell.strs[7][0] = "备注";

						sheetMap.put(data.getId(), cell);

					}
					cell.allVip += data.getVipMoney();
					cell.allDif += data.getDifMoney();
					cell.allDividendMoney += data.getDividendMoney();
					cell.allPurchaseMoney += data.getPurchaseMoney();
					cell.allRecordingMoney+= data.getRecordingMoney();
					cell.strs[0][i + 2] = Config.DATEFORMAT.format(classReport.getStartTime());
					cell.strs[1][i + 2] = Config.DATEFORMAT.format(data.getTime());
					cell.strs[2][i + 2] = data.getVipMoney() + "";
					cell.strs[3][i + 2] = data.getDifMoney() + "";
					cell.strs[4][i + 2] = data.getDividendMoney() + "";
					cell.strs[5][i + 2] = data.getPurchaseMoney() + "";
					cell.strs[6][i + 2] = data.getRecordingMoney() + "";
					cell.strs[7][i + 2] = classReport.getTip();
				}
			}

		}
		System.err.println("t11");
		for (Cell cell : sheetMap.values()) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < classReportList.size(); j++) {
					String titleStr = cell.strs[i][j];
					if (titleStr != null) {

						try {
							float data = Float.valueOf(titleStr);

							Number number = new Number(j, i, data);
							cell.sheet.addCell(number);

						} catch (Exception e) {
							// TODO: handle exception
							try {
								Label title = new Label(j, i, titleStr);
								cell.sheet.addCell(title);

							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

					}
					
					if(j==1&&i>=2&&i<=7)
					{
						Label formula=new Label(j, i, "=sum(c"+(i+1)+":ca"+(i+1)+")");
			
						try {
							cell.sheet.addCell(formula);
						} catch (WriteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

	
		}

		// for (ClassReport classReport : classReportMap.values()) {
		// List<OndutyData> ondutyDatas = classReport.getOndutyList();
		// if (ondutyDatas != null) {
		// for (OndutyData data : ondutyDatas) {
		// Cell cell = sheetMap.get(data.getId());
		// if (cell == null) {
		// cell = new Cell();
		// cell.sheet = workbook.createSheet(data.getId(), sheetNow);
		// cell.moneys.put("VIP 提成", new String[ondutyDatas.size()]);
		// cell.moneys.put("交班金钱缺失", new String[ondutyDatas.size()]);
		// sheetNow++;
		// }
		// cell.titles.put(Config.DATEFORMAT.format(data.getTime()),
		// cell.titleIndex);
		//
		// cell.titleIndex++;
		//
		// }
		// }
		// }

	}

	public class Cell {

		WritableSheet sheet;
		float allVip = 0;
		float allDif = 0;
		float allPurchaseMoney = 0;
		float allRecordingMoney = 0;
		float allDividendMoney = 0;
		String[][] strs;

	}

	public class CellLine {
		public Map<String, List<Label>> map;

	}
}
