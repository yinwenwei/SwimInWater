package com.yyl.api.scenicarea;

import java.util.List;

import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Scenicspot;

import io.swagger.annotations.Api;

/**
 * 
* @ClassName: Scenicarea
* @Description: TODO 景点模块相关
* @author lkw
* @date 2019年1月9日 下午12:16:42
*
 */
@Api(value="Scenicarea")
public interface ScenicareaApi {
	//查询景点信息
	List<Scenicspot> findScenicspotAll();
	//查询景点分区(dTypeClassification='scenic_Region')
	List<Dictionary> findScenicRegion();
	//查询酒店信息
	List<Hotel> findHotelAll(); 
	
	
	//多条件搜索
	
	//查询路线
	
	//查询图片
}
