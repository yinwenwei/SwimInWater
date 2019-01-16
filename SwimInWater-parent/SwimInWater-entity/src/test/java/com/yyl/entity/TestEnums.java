package com.yyl.entity;

import org.junit.Test;

import com.yyl.entity.enums.ScenicspotRegoin;
import com.yyl.entity.enums.UserRole;
import com.yyl.entity.enums.UserSex;

public class TestEnums {
	/**
	 * 获取用户性别
	 * @Title: testUserSex
	 * @return void    返回类型
	 * @throws
	 */
	@Test
	public void testUserSex(){
    	System.out.println(UserSex.MAN.getIndex());
    	System.out.println(UserSex.MAN.getSex());
    	System.out.println(UserSex.FEMALE.getIndex());
    	System.out.println(UserSex.FEMALE.getSex());
	}
	
	/**
	 * 获取用户权限
	 * @Title: testUserSex
	 * @return void    返回类型
	 * @throws
	 */
	@Test
	public void testUserRole(){
    	System.out.println(UserRole.MNAGER.getIndex());
    	System.out.println(UserRole.MNAGER.getRole());
    	System.out.println(UserRole.NORMAL.getIndex());
    	System.out.println(UserRole.NORMAL.getRole());
	}
	
	@Test
	public void testScenicspotRegoin(){
    	System.out.println(ScenicspotRegoin.DOMESTIC.getIndex());
    	System.out.println(ScenicspotRegoin.DOMESTIC.getRegoin());
    	System.out.println(ScenicspotRegoin.FOREIGN.getIndex());
    	System.out.println(ScenicspotRegoin.FOREIGN.getRegoin());
    	System.out.println(ScenicspotRegoin.HK_AND_Maco.getIndex());
    	System.out.println(ScenicspotRegoin.HK_AND_Maco.getRegoin());
	}

}
