package com.yyl.scenicarea.service.orders;
import com.yyl.entity.Orders;
import com.yyl.entity.PageBean;
import com.yyl.scenicarea.repository.orders.OrdersQueryMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class OrdersQueryServiceImpl implements OrdersQueryService {

    @Resource
    private OrdersQueryMapper ordersQueryMapper;

    public Orders getOrdersById(Integer id){
        try {
			 return ordersQueryMapper.getOrdersById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Orders> getOrdersListByMap(Map<String,Object> param){
        try {
			return ordersQueryMapper.getOrdersListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getOrdersCountByMap(Map<String,Object> param){
        try {
			return ordersQueryMapper.getOrdersCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Orders> queryOrdersPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = ordersQueryMapper.getOrdersCountByMap(param);
            PageBean<Orders> pageBean = new PageBean<Orders>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Orders> ordersList = ordersQueryMapper.getOrdersListByMap(param);
            pageBean.setList(ordersList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
