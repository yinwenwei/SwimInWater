package com.yyl.web.frontend;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyl.api.ModelApi;

@Api(value="景点访问控制器", tags={"景点相关"})
@Controller
public class ScenicareaController {
	private Logger logger = LoggerFactory.getLogger(ScenicareaController.class);
	@Resource
	private ModelApi modelApi;
	
	@ApiOperation(value="请求景点详情页面", notes="根据景点id查询景点详情")
	@ApiImplicitParam(name = "id", value = "景点编号", required = true, paramType = "query")
	@RequestMapping(value = "/scenicareaInfo", method = RequestMethod.GET)
	public String queryScenicareaInfoById(Model model, Integer id){
		logger.info("接收请求,参数:{}", id);
		// 查询景点详细信息
		
		
		model.addAttribute("", "");
		logger.info("处理请求,结果:{}", "");
		return "frontend/";
	}
	
	
}
