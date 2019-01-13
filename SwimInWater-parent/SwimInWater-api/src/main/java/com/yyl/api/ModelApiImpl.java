package com.yyl.api;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.yyl.api.comment.CommentApi;
import com.yyl.api.manager.ManagerApi;
import com.yyl.api.scenicarea.ScenicareaApi;
/**
 * 
* @ClassName: ModelApi
* @Description: Api模块相关
* @author lkw
* @date 2019年1月13日 上午11:32:23
*
 */
@Component
public class ModelApiImpl implements ModelApi{
	@Resource
	private CommentApi commentApi;
	@Resource
	private ScenicareaApi scenicareaApi;
	@Resource
	private ManagerApi managerApi;
	
	/**
	 * 获取评论模块相关接口
	* @Title: getCommentApi
	* @return CommentApi    返回类型
	* @throws
	 */
	public CommentApi getCommentApi() {
		return commentApi;
	}
	/**
	 * 获取景点模块相关接口
	* @Title: getScenicareaApi
	* @return ScenicareaApi    返回类型
	* @throws
	 */
	public ScenicareaApi getScenicareaApi() {
		return scenicareaApi;
	}
	/**
	 * 获取管理模块相关接口
	* @Title: getScenicareaApi
	* @return ScenicareaApi    返回类型
	* @throws
	 */
	public ManagerApi getManagerApi() {
		return managerApi;
	}
	

}
