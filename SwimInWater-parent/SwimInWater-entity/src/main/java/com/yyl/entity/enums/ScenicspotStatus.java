package com.yyl.entity.enums;

public enum ScenicspotStatus {
	PUBLISH(1, "已发布"),
	UNPUBLISH(2, "未发布"),
	HOT(3, "热门");
	
	private Integer index;
	
	private String statu;

	private ScenicspotStatus(Integer index, String statu) {
		this.index = index;
		this.statu = statu;
	}

	public Integer getIndex() {
		return index;
	}

	public String getStatu() {
		return statu;
	}
	
	

}
