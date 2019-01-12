package com.yyl.api.manager;

import java.util.List;

import com.yyl.entity.Hotel;
import com.yyl.entity.Line;
import com.yyl.entity.Orders;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;


/**
 * 
* @ClassName: Manager
* @Description: TODO 管理模块相关
* @author lkw
* @date 2019年1月9日 下午12:16:07
*
 */
public interface ManagerApi {
	
	//-----------------------------用户------------------------------------------------------
	
	/**
	 * 
	 * @Title: selLogin
	 * @Description: 登录
	 * @param @param uName
	 * @return User    返回类型
	 * @throws
	 */
	User selLogin(String uName);
	/**
	 * 
	 * @Title: addRegister
	 * @Description: 注册用户
	 * @param @param user
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addRegister(User user);
	/**
	 * 
	 * @Title: setUserList
	 * @Description: 查询所有用户
	 * @return List<User>    返回类型
	 * @throws
	 */
	List<User> setUserList();
	
	//-----------------------------景点------------------------------------------------------
	/**
	 * 
	 * @Title: selScenicspotList
	 * @Description: 查询景点信息
	 * @return List<Scenicspot>    返回类型
	 * @throws
	 */
	List<Scenicspot> selScenicspotList();
	/**
	 * 
	 * @Title: addScenicspot
	 * @Description: 添加景点信息
	 * @param @param scenicspot
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addScenicspot(Scenicspot scenicspot);
	/**
	 * 
	 * @Title: uplScenicspot
	 * @Description: 修改景点信息
	 * @param @param scenicspot
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplScenicspot(Scenicspot scenicspot);
	 
	//-----------------------------路线------------------------------------------------------
	/**
	 * 
	 * @Title: selLineList
	 * @Description: 查询线路信息
	 * @return List<Line>    返回类型
	 * @throws
	 */
	List<Line> selLineList();
	//添加线路信息
	Integer addLine(Line line);
	//修改路线信息
	Integer uplLine(Line line);
	//删除路线信息
	Integer delLine(Integer id);
	
	//-----------------------------酒店------------------------------------------------------
	/**
	 * 
	 * @Title: selHotelList
	 * @Description: 查询酒店信息
	 * @return List<Hotel>    返回类型
	 * @throws
	 */
	List<Hotel> selHotelList();
	/**
	 * 
	 * @Title: addHotel
	 * @Description: 添加酒店信息
	 * @param @param hotel
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addHotel(Hotel hotel);
	/**
	 * 
	 * @Title: uplHotel
	 * @Description: 修改酒店信息
	 * @param @param hotel
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplHotel(Hotel hotel);
	/**
	 * 
	 * @Title: delHotel
	 * @Description: 删除信息
	 * @param @param id
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer delHotel(Integer id);
	
	//-----------------------------订单------------------------------------------------------
	/**
	 * 
	 * @Title: selOrdersList
	 * @Description: 查询订单信息
	 * @return List<Orders>    返回类型
	 * @throws
	 */
	List<Orders> selOrdersList();
	/**
	 * 
	 * @Title: addOrders
	 * @Description: 添加订单信息
	 * @param @param orders
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer addOrders(Orders orders);
	/**
	 * 
	 * @Title: uplOrders
	 * @Description: 修改订单信息
	 * @param @param orders
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer uplOrders(Orders orders);
	/**
	 * 
	 * @Title: delOrders
	 * @Description: 删除订单信息(只能删除未付款的)
	 * @param @param id
	 * @return Integer    返回类型
	 * @throws
	 */
	Integer delOrders(Integer id);
	

}
