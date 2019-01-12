package com.yyl.scenicarea.repository.hotel;
import com.yyl.entity.Hotel;
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

}
