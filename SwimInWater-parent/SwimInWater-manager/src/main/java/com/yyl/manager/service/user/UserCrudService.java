package com.yyl.manager.service.user;
import com.yyl.entity.User;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
* 业务接口
*/
public interface UserCrudService {

    public User getUserById(Integer id);

    public List<User> getUserListByMap(Map<String,Object> param);

    public Integer getUserCountByMap(Map<String,Object> param);

    public Integer addUser(User user);

    public Integer modifyUser(User user);

    public Integer deleteUserById(Integer id);

    public PageBean<User> queryUserPageByMap(Map<String,Object> param,Integer size,Integer cur);
}
