package com.yyl.api.scenicarea;

import java.util.List;

import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;


/**
 * 
* @ClassName: Scenicarea
* @Description: TODO 景点模块相关
* @author yww
* @date 2019年1月9日 下午12:16:42
*
 */
public interface ScenicareaApi {
	/**
	 * 
	 * @Title: findScenicspotAll
	 * @Description: 查询景点信息
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotAll();
	/**
	 * 
	 * @Title: findScenicRegion
	 * @Description: 查询景点分区(dTypeClassification='scenic_Region')
	 * @return List<Dictionary>    返回类型
	 * @throws
	 */
	List<Dictionary> findScenicRegion();
	/**
	 * 
	 * @Title: findScenicspotBySNameOrSCity
	 * @Description: 根据景点名称或景点城市查询
	 * @param @param sName
	 * @param @param sCity
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotBySNameOrSCity(String sName,String sCity);
	/**
	 * 
	 * @Title: findLine
	 * @Description: 根据路线名称查询路线信息
	 * @param @param lName
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> findLine(String lName);
	/**
	 * 
	 * @Title: findHotelAll
	 * @Description: 查询酒店信息
	 * @return List<Hotel>    返回类型
	 * @throws
	 */
	List<Hotel> findHotelAll(); 
	/**
	 * 
	 * @Title: findLineLikeLNameOrSPrice
	 * @Description: 多条件搜索(根据线路名称,景点价格)
	 * @param @param lName
	 * @param @param sPrice
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> findLineLikeLNameOrSPrice(String lName,Integer sPrice);
	/**
	 * 
	 * @Title: findHotelPictureByPTypeId
	 * @Description: 查询酒店图片(SELECT p.id FROM picture p,hotel h WHERE p.pTypeId=h.id AND p.pType=3 AND p.pTypeId=1)
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findHotelPictureByPTypeId(Integer pTypeId);
	/**
	 * 
	 * @Title: findScenicspotPictureByPTypeId
	 * @Description: 查询景点图片(SELECT p.id FROM picture p,scenicspot s WHERE p.pTypeId=s.id AND p.pType=2 AND p.pTypeId=? )
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findScenicspotPictureByPTypeId(Integer pTypeId);
	
	
	//TODO分页
	
}
