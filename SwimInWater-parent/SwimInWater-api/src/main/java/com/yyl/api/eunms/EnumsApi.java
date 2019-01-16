package com.yyl.api.eunms;

/**
 * 获取枚举
 * @ClassName: EnumsApi
 * @author lkw
 * @date 2019年1月16日 上午9:05:34
 *
 */
public interface EnumsApi {
	/**
	 * 获取用户性别枚举
	 * @Title: getUserSex
	 * @return String   用户性别
	 * @throws
	 */
	String getUserSex(Integer index);
	/**
	 * 获取用户权限枚举
	 * @Title: getUserRole
	 * @return String   用户权限
	 * @throws
	 */
	String getUserRole(Integer index);
	/**
	 * 获取景点状态枚举
	 * @Title: getScenicspotStatus
	 * @return String    景点状态
	 * @throws
	 */
	String getScenicspotStatus(Integer index);
	/**
	 * 获取景点区域枚举
	 * @Title: getScenicspotRegoin
	 * @return String    景点区域
	 * @throws
	 */
	String getScenicspotRegoin(Integer index);
	/**
	 * 获取酒店等级
	 * @Title: getHotelGrage
	 * @param @param index
	 * @return String  酒店等级
	 * @throws
	 */
	String getHotelGrage(Integer index);
	/**
	 * 获取酒店状态
	 * @Title: getOrderStatus
	 * @param @param index
	 * @return String  酒店状态
	 * @throws
	 */
	String getOrderStatus(Integer index);
	/**
	 * 
	 * @Title: getPictureType
	 * @param @param index
	 * @return String    返回类型
	 * @throws
	 */
	String getPictureType(Integer index);
}
