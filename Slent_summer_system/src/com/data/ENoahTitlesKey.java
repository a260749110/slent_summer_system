package com.data;

public enum ENoahTitlesKey {
	prize_draw1_use("prize_draw1_use"),//轮盘抽奖需要的积分
	sign_gift("sign_gift"),//每日签到赠送积分 
	;

	private String key;

	ENoahTitlesKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
