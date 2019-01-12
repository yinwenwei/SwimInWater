package com.yyl.manager.service.orders;
import com.yyl.entity.Orders;
/**
* 业务接口
*/
public interface OrdersCudService {

    public Integer addOrders(Orders orders);

    public Integer modifyOrders(Orders orders);

    public Integer deleteOrdersById(Integer id);
}
