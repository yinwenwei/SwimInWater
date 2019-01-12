package com.yyl.manager.repository.orders;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Orders;

/**
mapper接口
*/
public interface OrdersCudMapper {

	public Integer insertOrders(Orders orders) throws Exception;

	public Integer updateOrders(Orders orders) throws Exception;

	public Integer deleteOrdersById(@Param(value = "id") Integer id) throws Exception;

}
