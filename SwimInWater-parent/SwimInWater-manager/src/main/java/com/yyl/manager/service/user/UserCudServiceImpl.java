package com.yyl.manager.service.user;
import com.yyl.entity.User;
import com.yyl.entity.PageBean;
import com.yyl.manager.repository.user.UserMapper;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
业务接口实现
*/
@Service
public class UserCudServiceImpl implements UserCudService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(Integer id){
        try {
			 return userMapper.getUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<User> getUserListByMap(Map<String,Object> param){
        try {
			return userMapper.getUserListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getUserCountByMap(Map<String,Object> param){
        try {
			return userMapper.getUserCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer addUser(User user){
        try {
			return userMapper.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyUser(User user){
        try {
			return userMapper.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deleteUserById(Integer id){
        try {
			return userMapper.deleteUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<User> queryUserPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = userMapper.getUserCountByMap(param);
            PageBean<User> pageBean = new PageBean<User>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<User> userList = userMapper.getUserListByMap(param);
            pageBean.setList(userList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
