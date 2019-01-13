package com.yyl.manager;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yyl.api.manager.ManagerApi;
import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Orders;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;
@Component("managerApi")
public class ManagerApiImpl implements ManagerApi {

	@Override
	public User selLogin(String uName) {
		return null;
	}

	@Override
	public Integer addRegister(User user) {
		return null;
	}

	@Override
	public List<User> setUserList() {
		return null;
	}

	@Override
	public List<Scenicspot> selScenicspotList() {
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
	public List<Line> selLineList() {
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
	public List<Hotel> selHotelList() {
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
	public List<Orders> selOrdersList() {
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

}
