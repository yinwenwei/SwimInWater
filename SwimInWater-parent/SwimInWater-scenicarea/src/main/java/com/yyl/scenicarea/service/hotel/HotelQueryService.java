package com.yyl.scenicarea.service.hotel;
import com.yyl.entity.Hotel;
import com.yyl.entity.Picture;

import java.util.List;
import java.util.Map;

import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface HotelQueryService {

    public Hotel getHotelById(Integer id);

    public List<Hotel> getHotelListByMap(Map<String,Object> param);

    public Integer getHotelCountByMap(Map<String,Object> param);

    public PageBean<Hotel> queryHotelPageByMap(Map<String,Object> param,Integer size,Integer cur);
	/**
	 * 
	 * @Title: findHotelPictureByPTypeId
	 * @Description: 查询酒店图片(SELECT p.id FROM picture p,hotel h WHERE p.pTypeId=h.id AND p.pType=3 AND p.pTypeId=1)
	 * @param @param pTypeId
	 * @return List<Picture>    返回类型
	 * @throws
	 */
	List<Picture> findHotelPictureByPTypeId(List<Integer> pTypeId);
}
