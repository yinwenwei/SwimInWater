package com.yyl.manager.repository.user;
import org.apache.ibatis.annotations.Param;

import com.yyl.entity.User;

import java.util.List;
import java.util.Map;
/**
mapper接口
*/
public interface UserMapper {

	public User getUserById(@Param(value = "id") Integer id) throws Exception;

	public List<User> getUserListByMap(Map<String,Object> param) throws Exception;

	public Integer getUserCountByMap(Map<String,Object> param) throws Exception;

	public Integer insertUser(User user) throws Exception;

	public Integer updateUser(User user) throws Exception;

	public Integer deleteUserById(@Param(value = "id") Integer id) throws Exception;

}
