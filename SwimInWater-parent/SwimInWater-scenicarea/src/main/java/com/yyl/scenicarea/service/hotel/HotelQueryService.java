package com.yyl.scenicarea.service.hotel;
import com.yyl.entity.Hotel;
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
}
