package com.yyl.entity.enums;
/**
 * 图片类型
 * @ClassName: PictureType
 * @author lkw
 * @date 2019年1月16日 上午9:59:08
 *
 */
public enum PictureType {
	USER_PIC(1, "用户头像"),
	SCENIC_PIC(2, "景点图片"),
	HOTEL_PIC(3, "酒店图片");
	
	private Integer index;
	
	private String type;

	private PictureType(Integer index, String type) {
		this.index = index;
		this.type = type;
	}

	public Integer getIndex() {
		return index;
	}

	public String getType() {
		return type;
	}
	
	
}
