package com.yyl.web;

import com.yyl.api.ModelApiImpl;
import com.yyl.entity.Hotel;
import com.yyl.entity.PageBean;
import com.yyl.entity.Scenicspot;
import com.yyl.entity.User;
import com.yyl.util.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 
* @ClassName: JspController
* @Description: 跳转jsp
* @author lkw
* @date 2019年1月11日 上午8:38:33
*
 */
@Api(value="页面控制器", tags={"页面跳转请求"})
@Controller
public class JspController {
	
	private Logger logger = LoggerFactory.getLogger(JspController.class);
	
	@Resource
	private ModelApiImpl modelApi;
	
	@ApiOperation(value="请求登录页面",notes="进入登录页面")
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		logger.info("接收到请求");
		logger.info("处理请求");
		return "/frontend/login";
	}

	@ApiOperation(value="请求订单页面",notes="进入订单页面")
	@RequestMapping(value="/order",method=RequestMethod.GET)
	public String orderPage(){
//		logger.info("接收到请求,参数:{}", "顶顶顶顶顶顶顶");
		return "/frontend/route_order_page";
	}
	
	@ApiOperation(value="接收登录请求",notes="用户登录")
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public String dologin(String uName,String uPwd,HttpSession session){
		logger.info("接收到请求,参数:{}", uName,uPwd);
		User user = modelApi.getManagerApi().selLogin(uName, uPwd);
		if(user!=null){
			session.setAttribute(Constants.USER_SESSION, user);
			return "redirect:/index";
		}
		return "/frontend/login";
		
	}
	
	@ApiOperation(value="接收用户退出请求",notes="用户注销")
	@RequestMapping(value="userexit",method=RequestMethod.GET)
	public String userexit(HttpSession session){
		
		session.removeAttribute(Constants.USER_SESSION);
		
		return "redirect:/index";
	}
	
	
	@ApiOperation(value="请求注册页面",notes="用户注册")
	@RequestMapping(value="/register_ok",method=RequestMethod.GET)
	public String registerOk(){
		logger.info("接收到请求");
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求");
		return "/frontend/register_ok";
	}
	@ApiOperation(value="请求我的收藏页面",notes="用户收藏")
	@RequestMapping(value="/myfavorite",method=RequestMethod.GET)
	public String myfavorite(){
		logger.info("接收到请求");
		// TODO domesticTourism():获取需要数据,返回相应页面
		logger.info("处理请求");
		return "/frontend/myfavorite";
	}
	
	
	//------------------------------------------------------------------------------
	
	
	@ApiOperation(value="请求国内游页面",notes="查询所有国内游的景点,分页显示")
	@RequestMapping(value = "/Domestic_tourism", method=RequestMethod.GET)
	public String domesticTourism(Model model,Integer currentPage){
		logger.info("接收到请求,参数:{}", "");
		
		//查询国内区域旅游信息
		PageBean<Scenicspot> pageBean = modelApi.getScenicareaApi().findScenicspotBySRegion(1, 5, currentPage);
		model.addAttribute("pageBean", pageBean);
		
		logger.info("处理请求,结果:{}", "hehe");
		return "frontend/Domestic_tourism";	
	}
	
	@ApiOperation(value="请求酒店页面", notes="查询全部酒店,分页显示")
	@RequestMapping(value = "/Hotel", method=RequestMethod.GET)
	public String hotel(Model model,Integer currentPage){
		logger.info("接收到请求,参数:{}", "");
		
		//查询酒店详情
		PageBean<Hotel> pageBean = modelApi.getScenicareaApi().queryHotelPageByMap(5, currentPage);
		model.addAttribute("pageBean", pageBean);
		
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Hotel";	
	}
	
	
	@ApiOperation(value="请求境外游页面", notes="查询全部境外游景点")
	@RequestMapping(value = "/Outbound_travel", method=RequestMethod.GET)
	public String outboundTravel(Model model,Integer currentPage){
		logger.info("接收到请求,参数:{}", "");
		
		//查询境外游
		PageBean<Scenicspot> pageBean = modelApi.getScenicareaApi().findScenicspotBySRegion(2, 5, currentPage);
		model.addAttribute("pageBean", pageBean);
		
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Outbound_travel";	
	}
	
	@ApiOperation(value="请求出港澳页面", notes="查询全部港澳游景点")
	@RequestMapping(value = "/Hong_Kong_and_Macao_travel", method=RequestMethod.GET)
	public String hongKongAndMacaoTravel(Model model,Integer currentPage){
		logger.info("接收到请求,参数:{}", "");
		//查询境外游
		PageBean<Scenicspot> pageBean = modelApi.getScenicareaApi().findScenicspotBySRegion(3, 5, currentPage);
		model.addAttribute("pageBean", pageBean);
		
		
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Hong_Kong_and_Macao_travel";	
	}
	
	@ApiOperation(value="请求全球自由行页面", notes="查询全球自由行景点")
	@RequestMapping(value = "/Global_Free_Travel", method=RequestMethod.GET)
	public String globalFreeTravel(){
		logger.info("接收到请求,参数:{}", "");
		// TODO globalFreeTravel():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/Global_Free_Travel";	
	}
	
	@ApiOperation(value="请求收藏排行榜页面", notes="查询收藏排行榜")
	@RequestMapping(value = "/favoriterank", method=RequestMethod.GET)
	public String favoriterank(Model model){
		logger.info("接收到请求,参数:{}", "");
		List<Scenicspot> collectionList = modelApi.getScenicareaApi().findScenCollectionOrderByDesc();
		model.addAttribute("collectionList", collectionList);
		// TODO favoriterank():获取需要数据,返回相应页面
		logger.info("处理请求,结果:{}", "");
		return "/frontend/favoriterank";	
	}
	
}
