package com.yyl.scenicarea.service.orders;
import com.yyl.entity.Orders;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface OrdersQueryService {

    public Orders getOrdersById(Integer id);

    public List<Orders> getOrdersListByMap(Map<String,Object> param);

    public Integer getOrdersCountByMap(Map<String,Object> param);

    public PageBean<Orders> queryOrdersPageByMap(Map<String,Object> param,Integer size,Integer cur);
}
