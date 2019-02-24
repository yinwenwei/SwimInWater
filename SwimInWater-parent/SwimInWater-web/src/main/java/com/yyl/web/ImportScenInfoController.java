package com.yyl.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yyl.api.ModelApi;
import com.yyl.entity.ScenInfo;
import com.yyl.entity.ScenResult;
@Controller
@RequestMapping("/solr")
public class ImportScenInfoController {
	@Autowired
	private ModelApi modelApi;
	
	@RequestMapping("/importall")
	@ResponseBody
	public Object importAllScen(){
		modelApi.getScenicareaApi().importAllScenInfo();
		return "OK";
	}
	
	/**
	 * 查询solr索引库
	 * @Title: searchfunction
	 * @param @param model
	 * @param @param sname
	 * @param @param page
	 * @param @param rows
	 * @param @return    设定文件
	 * @return String    返回类型
	 * @throws
	 */
	@RequestMapping("/search")
	public String searchfunction(Model model,String sname,
			@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="1")Integer rows){
	
		try {
			sname=new String(sname.getBytes("ISO-8859-1"),"UTF-8");
			System.out.println("进入----------------------------------------"+sname);
			ScenResult scen = modelApi.getScenicareaApi().searScenInfo(sname, page, rows);
			System.out.println(scen.getPageCount());
			List<ScenInfo> scenList = scen.getScenList();
			for (ScenInfo scenInfo : scenList) {
				System.out.println("标题:"+scenInfo.getsName()+"\n内容"+scenInfo.getsContent());
			}
			model.addAttribute("scen", scen);
			model.addAttribute("sname", sname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "frontend/Tourism";
	}
}
