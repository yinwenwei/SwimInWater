package com.yyl.comment.repository;
import com.yyl.entity.Comment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
/**
 * 
* @ClassName: CommentMapper
* @Description: 评论相关接口
* @author lkw
* @date 2019年1月10日 上午8:56:04
*
 */
public interface CommentMapper {
	
	Comment getCommentById(@Param(value = "id") Integer id) throws Exception;

	List<Comment> getCommentListByMap(Map<String,Object> param) throws Exception;

	Integer getCommentCountByMap(Map<String,Object> param) throws Exception;

	Integer insertComment(Comment comment) throws Exception;

	Integer updateComment(Comment comment) throws Exception;

	Integer deleteCommentById(@Param(value = "id") Integer id) throws Exception;

}
