package com.report;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.Config;
import com.sql.mapperBean.TLandId;
import com.sql.mapperBean.TUser;
import com.user.UserManager;

public class ClassReport {
	private TLandId landId;
	private List<OndutyData> ondutyList;
	private Map<String, OndutyData> ondutyMap;
	private Date startTime;
	private float money_cash = 0;
	private float moeny_dif = 0;
	private StringBuffer tip=new StringBuffer();;

	public ClassReport(TLandId landId) {
		this.setLandId(landId);

		ondutyList = new ArrayList<OndutyData>();
		ondutyMap=new HashMap<String, ClassReport.OndutyData>();
		try {
			setStartTime(landId.getLandTime());
			JSONObject landInfo = new JSONObject(landId.getLandInfo());
			JSONArray ondutys = landInfo.getJSONArray("onduty_list");
			if (ondutys != null) {
				for (int i = 0; i < ondutys.length(); i++) {
					JSONObject jb = ondutys.getJSONObject(i);
					OndutyData ondutyData = OndutyData.create(jb);

					if (Math.abs(ondutyData.getTime().getHours() - 10) < 2
							|| Math.abs(ondutyData.getTime().getHours() - 14) < 2
							|| Math.abs(ondutyData.getTime().getHours() - 16) < 2

					) {
						ondutyList.add(ondutyData);
						ondutyMap.put(ondutyData.getId(), ondutyData);
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public float getMoney_cash() {
		return money_cash;
	}

	public void setMoney_cash(float money_cash) {
		this.money_cash = money_cash;
	}

	public float getMoeny_dif() {
		return moeny_dif;
	}

	public void setMoeny_dif(float moeny_dif) {
		this.moeny_dif = moeny_dif;
	}


	
	public static class OndutyData {
		private String id;
		private String name;
		private Timestamp time;
		private float vipMoney = 0;
		private float difMoney = 0;
		private	float purchaseMoney=0;
		private	float recordingMoney=0;
		private	float dividendMoney=0;
		private OndutyData(JSONObject jb) throws JSONException, ParseException {

			setId(jb.getString("id"));
			Date date=Config.DATEFORMAT.parse(jb.getString("time"));
			Timestamp time=new Timestamp(Config.DATEFORMAT.parse(jb.getString("time")).getTime());
			setTime(new Timestamp(Config.DATEFORMAT.parse(jb.getString("time")).getTime()));
			UserManager.instance.reflash();
			TUser user = UserManager.instance.getUser(getId());
			if(user!=null)
			{
			setName(user.getName());
			}
			else
			{
				setName(getId());
				
			}
		}

		public static OndutyData create(JSONObject jb) {
			try {
				return new OndutyData(jb);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Timestamp getTime() {
			return time;
		}

		public void setTime(Timestamp time) {
			this.time = time;
		}

		public float getVipMoney() {
			return vipMoney;
		}

		public void setVipMoney(float vipMoney) {
			this.vipMoney = vipMoney;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public float getDifMoney() {
			return difMoney;
		}

		public void setDifMoney(float difMoney) {
			this.difMoney = difMoney;
		}

		public float getPurchaseMoney() {
			return purchaseMoney;
		}

		public void setPurchaseMoney(float purchaseMoney) {
			this.purchaseMoney = purchaseMoney;
		}

		public float getRecordingMoney() {
			return recordingMoney;
		}

		public void setRecordingMoney(float recordingMoney) {
			this.recordingMoney = recordingMoney;
		}
		
		public float getDividendMoney() {
			return dividendMoney;
		}

		public void setDividendMoney(float dividendMoney) {
			this.dividendMoney = dividendMoney;
		}
	}

	public List<OndutyData> getOndutyList() {
		return ondutyList;
	}

	public void setOndutyList(List<OndutyData> ondutyList) {
		this.ondutyList = ondutyList;
	}

	public String getTip() {
		if(tip==null||tip.length()==0)
			return "";
		return tip.toString();
	}

	public void setTip(String tip) {
		this.tip.append(";").append(tip);
	}

	public TLandId getLandId() {
		return landId;
	}

	public void setLandId(TLandId landId) {
		this.landId = landId;
	}
}
