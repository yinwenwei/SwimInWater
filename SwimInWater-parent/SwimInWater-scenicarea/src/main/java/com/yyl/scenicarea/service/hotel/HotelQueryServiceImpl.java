package com.yyl.scenicarea.service.hotel;
import com.yyl.scenicarea.repository.hotel.HotelQueryMapper;
import com.yyl.entity.Hotel;
import com.yyl.entity.PageBean;
import com.yyl.entity.Picture;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class HotelQueryServiceImpl implements HotelQueryService {

    @Resource
    private HotelQueryMapper hotelQueryMapper;

    public Hotel getHotelById(Integer id){
        try {
			 return hotelQueryMapper.getHotelById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Hotel> getHotelListByMap(Map<String,Object> param){
        try {
			return hotelQueryMapper.getHotelListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getHotelCountByMap(Map<String,Object> param){
        try {
			return hotelQueryMapper.getHotelCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }


    public PageBean<Hotel> queryHotelPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = hotelQueryMapper.getHotelCountByMap(param);
            PageBean<Hotel> pageBean = new PageBean<Hotel>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Hotel> hotelList = hotelQueryMapper.getHotelListByMap(param);
            pageBean.setList(hotelList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
    
    /**
     * 根据酒店id查询酒店图片
     */
	@Override
	public List<Picture> findHotelPictureByPTypeId(List<Integer> pTypeId) {
		// TODO Auto-generated method stub
		try {
			return hotelQueryMapper.findHotelPictureByPTypeId(pTypeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
