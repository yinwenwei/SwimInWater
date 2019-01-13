package com.yyl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yyl.entity.User;




public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(SysInterceptor.class);
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		HttpSession session = request.getSession();
		
		System.out.println("---------------------------------");
		User user=(User) session.getAttribute(com.yyl.util.Constants.DEV_USER_SESSION);
		//DevUser devUser = (DevUser)session.getAttribute(Constants.DEV_USER_SESSION);
		
		logger.debug("=======================++"+user);
		//BackendUser backendUser = (BackendUser)session.getAttribute(Constants.USER_SESSION);
		
		
		if(null != user){ //dev SUCCESS
			return true;
		}else{
			response.sendRedirect(request.getContextPath()+"/403.jsp");
			return false;
		}
		/*else if(null != backendUser){ //backend SUCCESS
			return true;
		}*/
		
	}
}
