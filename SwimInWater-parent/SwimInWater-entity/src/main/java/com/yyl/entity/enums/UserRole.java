package com.yyl.entity.enums;
/**
 * 用户权限
 * @ClassName: UserRole
 * @author lkw
 * @date 2019年1月16日 上午8:48:53
 */
public enum UserRole {
	MNAGER(1, "管理员"),
	NORMAL(2 , "普通用户");
	
	private Integer index;
	
	private String Role;

	private UserRole(Integer index, String role) {
		this.index = index;
		Role = role;
	}

	public Integer getIndex() {
		return index;
	}

	public String getRole() {
		return Role;
	}
	
	
	

}
