package com.yyl.scenicarea.repository.hotel;
import com.yyl.entity.Hotel;
import com.yyl.entity.Picture;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface HotelQueryMapper {

	public Hotel getHotelById(@Param(value = "id") Integer id) throws Exception;

	public List<Hotel> getHotelListByMap(Map<String,Object> param) throws Exception;

	public Integer getHotelCountByMap(Map<String,Object> param) throws Exception;
	/**
	 * 
	 * @Title: findHotelPictureByPTypeId
	 * @Description: 查询酒店图片(SELECT p.id FROM picture p,hotel h WHERE p.pTypeId=h.id AND p.pType=3 AND p.pTypeId=1)
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findHotelPictureByPTypeId(List<Integer> pTypeId) throws Exception;

}
