package com.yyl.api.comment;

import java.util.List;
import com.yyl.entity.Comment;


/**
* 评论模块相关 
* @ClassName: Comment
* @author lkw
* @date 2019年1月9日 下午12:14:02
*
 */
public interface CommentApi {
	/**
	 * 添加评论
	* @Title: addComment
	* @param @param comment
	* @return Integer    返回类型
	* @throws
	 */
	Integer addComment(Comment comment);
	/**
	 * 根据景点id查询评论
	* @Title: queryComment
	* @param @param sId
	* @return List<Comment>    返回类型
	* @throws
	 */
	List<Comment> queryCommentBySId(String sId);
	/**
	 * 根据评论id,用户id删除评论
	* @Title: deleteComment
	* @param @param id
	* @return Integer    返回类型
	* @throws
	 */
	Integer deleteComment(String id, String uId);
	
	
}
