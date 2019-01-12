package com.yyl.manager.service.hotel;
import com.yyl.entity.Hotel;
import com.yyl.manager.repository.hotel.HotelCudMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
业务接口实现
*/
@Service
public class HotelCudServiceImpl implements HotelCudService {

    @Resource
    private HotelCudMapper hotelCudMapper;

    public Integer addHotel(Hotel hotel){
        try {
			return hotelCudMapper.insertHotel(hotel);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyHotel(Hotel hotel){
        try {
			return hotelCudMapper.updateHotel(hotel);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deleteHotelById(Integer id){
        try {
			return hotelCudMapper.deleteHotelById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
