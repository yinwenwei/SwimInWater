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
import com.yyl.manager.service.user.UserCrudService;
@Component("managerApi")
public class ManagerApiImpl implements ManagerApi {
	@Resource
	private UserCrudService UserCrudService;
	

	@Override
	public Integer addRegister(User user) {
		return null;
	}

	@Override
	public List<User> setUserList() {
		return null;
	}


	@Override
	public Integer addScenicspot(Scenicspot scenicspot) {
		return null;
	}

	@Override
	public Integer uplScenicspot(Scenicspot scenicspot) {
		return null;
	}

	@Override
	public Integer addLine(Line line) {
		return null;
	}

	@Override
	public Integer uplLine(Line line) {
		return null;
	}

	@Override
	public Integer delLine(Integer id) {
		return null;
	}

	@Override
	public Integer addHotel(Hotel hotel) {
		return null;
	}

	@Override
	public Integer uplHotel(Hotel hotel) {
		return null;
	}

	@Override
	public Integer delHotel(Integer id) {
		return null;
	}

	@Override
	public Integer addOrders(Orders orders) {
		return null;
	}

	@Override
	public Integer uplOrders(Orders orders) {
		return null;
	}

	@Override
	public Integer delOrders(Integer id) {
		return null;
	}

	@Override
	public User selLogin(String uName, String password, Integer uRole) {
		Map<String, Object> param = new HashMap<>();
		param.put("uName", uName);
		param.put("uPwd", password);
		param.put("uRole", uRole);
		List<User> list = UserCrudService.getUserListByMap(param);
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

}
