package com.yyl.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yyl.api.manager.ManagerApi;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Orders;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;
import com.yyl.manager.service.hotel.HotelCudService;
import com.yyl.manager.service.line.LineCudService;
import com.yyl.manager.service.orders.OrdersCudService;
import com.yyl.manager.service.scenicspot.ScenicspotCudService;
import com.yyl.manager.service.user.UserCudService;
@Component("managerApi")
public class ManagerApiImpl implements ManagerApi {
	@Resource
	private UserCudService userCudService;
	@Resource
	private ScenicspotCudService scenicspotCudService;
	@Resource
	private LineCudService lineCudService;
	@Resource
	private HotelCudService hotelCudService;
	@Resource
	private OrdersCudService ordersCudService;
	
	public final static Integer  USER_ROLE_MANAGER=1;

	//-----------------------------用户------------------------------------------------------
	
	@Override
	public User selLogin(String uName,String uPwd) {
		Map<String, Object> map=new HashMap<>();
		map.put("uName", uName);
		map.put("uPwd", uPwd);
		List<User> userList = userCudService.getUserListByMap(map);
		if(userList.size() >0){
			if(userList.get(0).getURole() == USER_ROLE_MANAGER){
				return userList.get(0);
			}
		}
		return null;
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

	//-----------------------------景点------------------------------------------------------

	@Override
	public Integer addScenicspot(Scenicspot scenicspot) {
		Integer addScenicspot = scenicspotCudService.addScenicspot(scenicspot);
		return addScenicspot;
	} 

	@Override
	public Integer uplScenicspot(Scenicspot scenicspot) {
		Integer modifyScenicspot = scenicspotCudService.modifyScenicspot(scenicspot);
		return modifyScenicspot;
	}
	//-----------------------------路线------------------------------------------------------
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
