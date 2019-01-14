package com.yyl.util;

public class Constants {
	public final static String USER_SESSION = "userSession";
	public final static String DEV_USER_SESSION = "devUserSession";
	public final static String SYS_RELEASE_STARUS = "release_Status";
	public final static String SYS_HOTEL_RATING = "hotel_Rating";
	public final static String SYS_SCENIS_REGION= "scenic_Region";
	public final static String SYS_MESSAGE = "message";
	public final static Integer  USER_ROLE_MANAGER=1;
	
	public final static int pageSize = 5;
	
	
	public final static String FILEUPLOAD_ERROR_1 = " * APK信息不完整！";
	public final static String FILEUPLOAD_ERROR_2 = " * 上传失败！";
	public final static String FILEUPLOAD_ERROR_3 = " * 上传文件格式不正确！";
	public final static String FILEUPLOAD_ERROR_4 = " * 上传文件过大！";
	public final static String MAP_SCEN = "map_scen";
	public final static String MAP_HOTEL = "map_hotel";
	public final static String MAP_LINE = "map_line";
	
	public final static String PIC_SCEN = "pic_scen";
	public final static String PIC_HOTEL = "pic_hotel";
	
	// 景点状态   		@see com.yyl.entity.Scenicspot: sStatus
	public final static Integer SCENICAREA_STATU_PUBLISH = 1;
	public final static Integer SCENICAREA_STATU_HOT = 2;
	public final static Integer SCENICAREA_STATU_UNPUBLISH = 3;
	
	// 景点所属地区	@see com.yyl.entity.Scenicspot: sRegion
	public final static String SCENICAREA_REGOIN_DOMESTIC = "1";
	public final static String SCENICAREA_REGOIN_HKANDMACAO = "2";
	public final static String SCENICAREA_REGOIN_FOREIGN = "3";
	
}
