package com.yyl.manager.service.hotel;
import com.yyl.entity.Hotel;
/**
* 业务接口
*/
public interface HotelCudService {

    public Integer addHotel(Hotel hotel);

    public Integer modifyHotel(Hotel hotel);

    public Integer deleteHotelById(Integer id);
}
