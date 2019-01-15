package com.yyl.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.yyl.api.manager.ManagerApi;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Orders;
import com.yyl.entity.Picture;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;
import com.yyl.manager.service.hotel.HotelCudService;
import com.yyl.manager.service.line.LineCudService;
import com.yyl.manager.service.orders.OrdersCudService;
import com.yyl.manager.service.picture.PictureCudService;
import com.yyl.manager.service.scenicspot.ScenicspotCudService;
import com.yyl.manager.service.user.UserCrudService;
@Component("managerApi")
public class ManagerApiImpl implements ManagerApi {
	@Resource
	private UserCrudService userCudService;
	@Resource
	private ScenicspotCudService scenicspotCudService;
	@Resource
	private LineCudService lineCudService;
	@Resource
	private HotelCudService hotelCudService;
	@Resource
	private OrdersCudService ordersCudService;
	@Resource
	private PictureCudService pictureCudService;
	
	private Logger logger = LoggerFactory.getLogger(ManagerApiImpl.class);

	//-----------------------------用户------------------------------------------------------
	
	@Override
	public User selLogin(String uName,String uPwd) {
		Map<String, Object> map=new HashMap<>();
		map.put("uName", uName);
		map.put("uPwd", uPwd);
		List<User> userList = userCudService.getUserListByMap(map);
		return userList.size() >0 ? userList.get(0):null;
	}
	@Override
	public Integer addRegister(User user) {
		Integer addUser = userCudService.addUser(user);
		return addUser;
	}

	@Override
	public List<User> setUserList() {
		List<User> userListByMap = userCudService.getUserListByMap(new HashMap<String,Object>());
		return userListByMap;
	}


	@Override
	public Integer addScenicspot(Scenicspot scenicspot, Hotel hotel, Line line, List<Picture> sPicList, List<Picture> hPicList) {
		// 添加景点
		Integer addScenicspotResult = scenicspotCudService.addScenicspot(scenicspot);
		// 获取景点id
		Integer sId = scenicspot.getId();
		logger.debug("处理添加景点业务,参数:景点id:{}", sId);
		// 添加景点图片
		for (Picture picture : sPicList) {
			picture.setPTypeId(sId);
			pictureCudService.addPicture(picture);
		}
		hotel.setsId(sId);
		// 添加酒店
		Integer addHotelResult = hotelCudService.addHotel(hotel);
		Integer hId = hotel.getId();
		// 添加酒店图片
		for (Picture picture : hPicList) {
			picture.setPTypeId(hId);
			pictureCudService.addPicture(picture);
		}
		line.setSId(sId);
		// 添加线路
		Integer addLineResult = lineCudService.addLine(line);
		if(addScenicspotResult > 0 && addHotelResult > 0 && addLineResult > 0){
			return 1;
		}
		return 0;
	} 

	@Override
	public Integer uplScenicspot(Scenicspot scenicspot) {
		Integer modifyScenicspot = scenicspotCudService.modifyScenicspot(scenicspot);
		return modifyScenicspot;
	}
	@Override
	public Integer addLine(Line line) {
		Integer addLine = lineCudService.addLine(line);
		return addLine;
	}
  
	@Override
	public Integer uplLine(Line line) {
		Integer modifyLine = lineCudService.modifyLine(line);
		return modifyLine;
	}

	@Override
	public Integer delLine(Integer id) {
		Integer deleteLineById = lineCudService.deleteLineById(id);
		return deleteLineById;
	}

	//-----------------------------酒店------------------------------------------------------
	@Override
	public Integer addHotel(Hotel hotel) {
		Integer addHotel = hotelCudService.addHotel(hotel);
		return addHotel;
	}

	@Override
	public Integer uplHotel(Hotel hotel) {
		Integer modifyHotel = hotelCudService.modifyHotel(hotel);
		return modifyHotel;
	}

	@Override
	public Integer delHotel(Integer id) {
		Integer deleteHotelById = hotelCudService.deleteHotelById(id);
		return deleteHotelById;
	}

	//-----------------------------订单------------------------------------------------------

	@Override
	public Integer addOrders(Orders orders) {
		Integer addOrders = ordersCudService.addOrders(orders);
		return addOrders;
	}

	@Override
	public Integer uplOrders(Orders orders) {
		Integer modifyOrders = ordersCudService.modifyOrders(orders);
		return modifyOrders;
	}

	@Override
	public Integer delOrders(Integer id) {
		Integer deleteOrdersById = ordersCudService.deleteOrdersById(id);
		return deleteOrdersById;
	}

}
