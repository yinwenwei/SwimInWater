package com.yyl.entity.enums;
/**
 * 酒店枚举
 * @ClassName: HotelGrage
 * @author lkw
 * @date 2019年1月16日 上午9:43:20
 *
 */
public enum HotelGrage {
	FOUR_STAR(1, "四星级"),
	FIVE_STAR(2, "五星级"),
	SIX_STAR(3, "六星级");
	
	private Integer index;
	
	private String grage;

	private HotelGrage(Integer index, String grage) {
		this.index = index;
		this.grage = grage;
	}

	public Integer getIndex() {
		return index;
	}

	public String getGrage() {
		return grage;
	}

	
	

}
