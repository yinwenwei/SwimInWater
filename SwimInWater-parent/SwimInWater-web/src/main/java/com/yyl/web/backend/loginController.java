package com.yyl.web.backend;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import io.swagger.annotations.ApiOperation;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yyl.api.ModelApi;
import com.yyl.entity.User;
import com.yyl.util.Constants;
@Controller
public class loginController {
	@Resource
	private ModelApi modelApi;
	
	private Logger logger=LoggerFactory.getLogger(loginController.class);
	@ApiOperation(value="请求后台登录页面",notes="用户登录页面")
	@RequestMapping(value="/backendlogin",method=RequestMethod.GET)
	public String backendlogi(){
		logger.info("接收到请求");
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求");
		return "/backend/backendlogin";
	}
	
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public String doLogin(String userCode,
						String userPassword,
						HttpServletRequest request,
						HttpSession session,
						Model model){
		logger.info("接收到请求,userCode:{},userPassword:{}",userCode,userPassword);
		User selLogin = modelApi.getManagerApi().selLogin(userCode, userPassword);
		if(selLogin != null){
			if(selLogin.getURole() == Constants.USER_ROLE_MANAGER){
				session.setAttribute(Constants.DEV_USER_SESSION, selLogin);
				logger.info("处理请求,结果:{}",selLogin);
				return "redirect:/dev/flatform/main.html";
			}else{
				request.setAttribute("error", "您没有权限进入！"); 
				logger.info("处理请求");
				return "/backend/backendlogin";
			}
		}else{
			request.setAttribute("error", "用户名或密码不正确！"); 
			logger.info("处理请求");
			return "/backend/backendlogin";
		}
	}
	
	@RequestMapping(value="/dev/flatform/main.html")
	public String main(){
		return "/backend/main";
	}
}
