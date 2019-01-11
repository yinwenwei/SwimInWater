package com.yyl.comment.service;
import com.yyl.entity.Comment;
import java.util.List;
import java.util.Map;
import com.yyl.entity.PageBean;
/**
 * 
* @ClassName: CommentService
* @Description: TODO评论业务接口
* @author lkw
* @date 2019年1月10日 上午9:03:21
*
 */
public interface CommentService {

    Comment getCommentById(Integer id);

    List<Comment> getCommentListByMap(Map<String,Object> param);

    Integer getCommentCountByMap(Map<String,Object> param);

    Integer addComment(Comment comment);

    Integer modifyComment(Comment comment);

    Integer deleteCommentById(Integer id);

    PageBean<Comment> queryCommentPageByMap(Map<String,Object> param,Integer size,Integer cur);
}
