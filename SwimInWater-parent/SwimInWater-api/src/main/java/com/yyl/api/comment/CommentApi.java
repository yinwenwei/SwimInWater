package com.yyl.api.comment;


import java.util.List;
import java.util.Map;

import com.yyl.entity.Comment;
import com.yyl.entity.PageBean;


/**
 * 
* @ClassName: Comment
* @Description: TODO 评论模块相关 
* @author lkw
* @date 2019年1月9日 下午12:14:02
*
 */
public interface CommentApi {
	Comment getCommentById(Integer id);
    List<Comment> getCommentListByMap(Map<String,Object> param);
    Integer getCommentCountByMap(Map<String,Object> param);
    Integer addComment(Comment comment);
    Integer modifyComment(Comment comment);
    Integer deleteCommentById(Integer id);
    PageBean<Comment> queryCommentPageByMap(Map<String,Object> param,Integer size,Integer cur);

}
