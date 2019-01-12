package com.yyl.manager.service.orders;
import com.yyl.entity.Orders;
import com.yyl.manager.repository.orders.OrdersCudMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
业务接口实现
*/
@Service
public class OrdersCudServiceImpl implements OrdersCudService {

    @Resource
    private OrdersCudMapper ordersCudMapper;


    public Integer addOrders(Orders orders){
        try {
			return ordersCudMapper.insertOrders(orders);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyOrders(Orders orders){
        try {
			return ordersCudMapper.updateOrders(orders);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deleteOrdersById(Integer id){
        try {
			return ordersCudMapper.deleteOrdersById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
