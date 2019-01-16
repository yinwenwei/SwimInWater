package com.yyl.api;

import com.yyl.api.comment.CommentApi;
import com.yyl.api.manager.ManagerApi;
import com.yyl.api.scenicarea.ScenicareaApi;
/**
 * 
* @ClassName: ModelApi
* @Description: 模块API
* @author lkw
* @date 2019年1月13日 上午11:42:33
*
 */
public interface ModelApi {
	
	CommentApi getCommentApi();
	
	ScenicareaApi getScenicareaApi();
	
	ManagerApi getManagerApi();
	
	 
}
