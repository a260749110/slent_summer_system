package com.spring.service.cells;

import com.unit.AutoJSONObjectBase;

public class PrizeDraw1Result extends AutoJSONObjectBase {
	private boolean flag = false;
	private String msg = "";
	private int resultIndex = 0;
	

	private long integral=0;
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getResultIndex() {
		return resultIndex;
	}

	public void setResultIndex(int resultIndex) {
		this.resultIndex = resultIndex;
	}

	public long getIntegral() {
		return integral;
	}

	public void setIntegral(long integral) {
		this.integral = integral;
	}

}
