package com.yyl.entity.enums;

public enum ScenicspotRegoin {
	DOMESTIC(1, "国内"),
	FOREIGN(2, "境外"),
	HK_AND_Maco(3, "港澳");
	
	private Integer index;
	
	private String regoin;

	private ScenicspotRegoin(Integer index, String regoin) {
		this.index = index;
		this.regoin = regoin;
	}

	public Integer getIndex() {
		return index;
	}

	public String getRegoin() {
		return regoin;
	}
	
	
}
