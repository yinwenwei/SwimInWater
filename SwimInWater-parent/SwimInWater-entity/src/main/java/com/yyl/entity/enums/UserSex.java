package com.yyl.entity.enums;
/**
 * 用户性别
 * @ClassName: UserSex
 * @author lkw
 * @date 2019年1月16日 上午8:48:42
 */
public enum UserSex {
	MAN(1, "男"),
	FEMALE(2, "女");
	
	private Integer index;
	private String sex;
	
	private UserSex(Integer index, String sex) {
		this.index = index;
		this.sex = sex;
	}

	public Integer getIndex() {
		return index;
	}

	public String getSex() {
		return sex;
	}  
	
}
