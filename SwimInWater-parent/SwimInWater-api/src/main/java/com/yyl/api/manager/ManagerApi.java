package com.yyl.api.manager;

import java.util.List;

import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Orders;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;


/**
 * 管理模块相关
* @ClassName: Manager
* @author ydb
* @date 2019年1月9日 下午12:16:07
*
 */
public interface ManagerApi {
	
	//-----------------------------用户------------------------------------------------------
	
	/**
	 * 登录
	 * @Title: selLogin
	 * @param @param uName
	 * @return User    返回类型
	 * @throws
	 */
	User selLogin(String uName);
	/**
	 * 注册用户
	 * @Title: addRegister
	 * @param @param user
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addRegister(User user);
	/**
	 * 查询所有用户
	 * @Title: setUserList
	 * @return List<User>    返回类型
	 * @throws
	 */
	List<User> setUserList();
	
	//-----------------------------景点------------------------------------------------------
	/**
	 * 查询景点信息
	 * @Title: selScenicspotList
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> selScenicspotList();
	/**
	 * 添加景点信息
	 * @Title: addScenicspot
	 * @param @param scenicspot
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addScenicspot(Scenicspot scenicspot);
	/**
	 * 修改景点信息
	 * @Title: uplScenicspot
	 * @param @param scenicspot
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplScenicspot(Scenicspot scenicspot);
	 
	//-----------------------------路线------------------------------------------------------
	/**
	 * 查询线路信息
	 * @Title: selLineList
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> selLineList();
	/**
	 * 添加线路信息
	 * @Title: addLine
	 * @param @param line
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addLine(Line line);
	/**
	 * 修改路线信息
	 * @Title: uplLine
	 * @param @param line
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplLine(Line line);
	/**
	 * 删除路线信息
	 * @Title: delLine
	 * @param @param id
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer delLine(Integer id);
	
	//-----------------------------酒店------------------------------------------------------
	/**
	 * 查询酒店信息
	 * @Title: selHotelList
	 * @return List<Hotel>    返回类型
	 * @throws
	 */
	List<Hotel> selHotelList();
	/**
	 * 添加酒店信息
	 * @Title: addHotel
	 * @param @param hotel
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addHotel(Hotel hotel);
	/**
	 * 修改酒店信息
	 * @Title: uplHotel
	 * @param @param hotel
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplHotel(Hotel hotel);
	/**
	 * 删除信息
	 * @Title: delHotel
	 * @param @param id
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer delHotel(Integer id);
	
	//-----------------------------订单------------------------------------------------------
	/**
	 * 查询订单信息
	 * @Title: selOrdersList
	 * @return List<Orders>    返回类型
	 * @throws
	 */
	List<Orders> selOrdersList();
	/**
	 *  添加订单信息
	 * @Title: addOrders
	 * @param @param orders
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addOrders(Orders orders);
	/**
	 *  修改订单信息
	 * @Title: uplOrders
	 * @param @param orders
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplOrders(Orders orders);
	/**
	 * 删除订单信息(只能删除未付款的)
	 * @Title: delOrders
	 * @param @param id
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer delOrders(Integer id);
	

	
}
