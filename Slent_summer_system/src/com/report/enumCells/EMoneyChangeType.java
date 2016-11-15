package com.report.enumCells;

public enum EMoneyChangeType {
	UNNOW(-999999, "未知", "未知"),

	CASH(0, "现金", "现金收入"), CASH_DIF(1, "交班金钱差补举报", ""), CLASSES_CASH_CHANGE(2, "交班现金差录入", "交班现金差录入"), CLASSES_CASH_DIF(
			3, "交班现金差录入", "交班现金差录入"), PURCHASE(-1, "入货", "入货"), RECORDING(-2, "入账", "入账"), DIVIDEND(-3, "分红", "分红");

	;
	private Integer id;
	private String type;
	private String tip;

	private EMoneyChangeType(int id, String type, String tip) {
		this.id = id;
		this.type = type;
		this.tip = tip;
	}

	public static EMoneyChangeType getById(Integer id)
	{
		for (EMoneyChangeType changeType:EMoneyChangeType.values()) {
			if(changeType.getId()==id)
			{
				return changeType;
			}
		}
		return EMoneyChangeType.UNNOW;
	}
	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getTip() {
		return tip;
	}

}
