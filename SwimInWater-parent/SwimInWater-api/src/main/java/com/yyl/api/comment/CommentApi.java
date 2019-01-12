package com.yyl.api.comment;

import java.util.List;

import com.yyl.entity.Comment;


/**
* 
* @ClassName: Comment
* @Description: TODO 评论模块相关 
* @author lkw
* @date 2019年1月9日 下午12:14:02
*
 */
public interface CommentApi {
	/**
	* @Title: addComment
	* @Description: 添加评论
	* @param @param comment
	* @param @return    设定文件
	* @return Integer    返回类型
	* @throws
	 */
	Integer addComment(Comment comment);
	/**
	* @Title: queryComment
	* @Description: 根据景点id查询评论
	* @param @param sId
	* @return List<Comment>    返回类型
	* @throws
	 */
	List<Comment> queryComment(String sId);
	/**
	* @Title: deleteComment
	* @Description: 根据评论id删除评论
	* @param @param id
	* @return Integer    返回类型
	* @throws
	 */
	Integer deleteComment(String id);
	
	
}
