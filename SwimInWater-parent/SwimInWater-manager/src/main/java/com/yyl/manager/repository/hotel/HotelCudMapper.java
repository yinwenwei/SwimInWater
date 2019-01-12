package com.yyl.manager.repository.hotel;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Hotel;

/**
mapper接口
*/
public interface HotelCudMapper {

	public Integer insertHotel(Hotel hotel) throws Exception;

	public Integer updateHotel(Hotel hotel) throws Exception;

	public Integer deleteHotelById(@Param(value = "id") Integer id) throws Exception;
}
