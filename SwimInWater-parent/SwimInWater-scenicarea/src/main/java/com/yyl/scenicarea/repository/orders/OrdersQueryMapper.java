package com.yyl.scenicarea.repository.orders;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.Orders;

import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface OrdersQueryMapper {

	public Orders getOrdersById(@Param(value = "id") Integer id) throws Exception;

	public List<Orders> getOrdersListByMap(Map<String,Object> param) throws Exception;

	public Integer getOrdersCountByMap(Map<String,Object> param) throws Exception;

}
