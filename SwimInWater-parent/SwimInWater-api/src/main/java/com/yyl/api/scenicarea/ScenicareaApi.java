package com.yyl.api.scenicarea;

import java.util.List;

import com.yyl.entity.Dictionary;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;


/**
 * 景点模块相关
* @ClassName: Scenicarea
* @author yww
* @date 2019年1月9日 下午12:16:42
*
 */
public interface ScenicareaApi {
	/**
	 * 查询景点信息
	 * @Title: findScenicspotAll
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotAll();
	/**
	 * 查询景点分区(dTypeClassification='scenic_Region')
	 * @Title: findScenicRegion
	 * @return List<Dictionary>    返回类型
	 * @throws
	 */
	List<Dictionary> findScenicRegion();
	/**
	 * 根据景点名称或景点城市查询
	 * @Title: findScenicspotBySNameOrSCity
	 * @param @param sName
	 * @param @param sCity
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> findScenicspotBySNameOrSCity(String sName,String sCity);
	/**
	 * 根据路线名称查询路线信息
	 * @Title: findLine
	 * @param @param lName
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> findLine(String lName);
	/**
	 * 查询酒店信息
	 * @Title: findHotelAll
	 * @return List<Hotel>    返回类型
	 * @throws
	 */
	List<Hotel> findHotelAll(); 
	/**
	 * 多条件搜索(根据线路名称,景点价格)
	 * @Title: findLineLikeLNameOrSPrice
	 * @param @param lName
	 * @param @param sPrice
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> findLineLikeLNameOrSPrice(String lName,Integer sPrice);
	/**
	 * 查询酒店图片(SELECT p.id FROM picture p,hotel h WHERE p.pTypeId=h.id AND p.pType=3 AND p.pTypeId=1)
	 * @Title: findHotelPictureByPTypeId
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findHotelPictureByPTypeId(Integer pTypeId);
	/**
	 * 查询景点图片(SELECT p.id FROM picture p,scenicspot s WHERE p.pTypeId=s.id AND p.pType=2 AND p.pTypeId=? )
	 * @Title: findScenicspotPictureByPTypeId
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findScenicspotPictureByPTypeId(Integer pTypeId);
	
	
	//TODO分页
	
}
