package com.yyl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yyl.entity.User;
import com.yyl.util.Constants;
/**
 * 
 * 后台用户权限拦截器
 * @ClassName: SysInterceptor
 * @author ydb
 * @date 2019年1月15日 上午12:28:54
 *
 */
public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = LoggerFactory.getLogger(SysInterceptor.class);
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		logger.info("权限拦截器接收到请求");
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute(Constants.DEV_USER_SESSION);
		if(null != user){
			logger.info("权限拦截器接处理请求:放行");
			return true;
		}else{
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			logger.info("权限拦截器接处理请求:拦截跳转错误页面");
			return false;
		}
		/*else if(null != backendUser){ //backend SUCCESS
			return true;
		}*/
		
	}
}
