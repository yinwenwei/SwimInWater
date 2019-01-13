package com.yyl.comment;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.yyl.api.comment.CommentApi;
import com.yyl.comment.service.CommentService;
import com.yyl.entity.Comment;
/**
 * 实现评论相关功能
* @ClassName: CommentImpl
* @author lkw
* @date 2019年1月12日 下午9:11:44
*
 */
@Component("commentApi")
public class CommentImpl implements CommentApi{
	@Resource
	private CommentService commentService;

	@Override
	public Integer addComment(Comment comment) {
		return commentService.addComment(comment);
	}

	@Override
	public List<Comment> queryCommentBySId(String sId) {
		HashMap<String, Object> param = new HashMap<>();
		param.put("sId", sId);
		return commentService.getCommentListByMap(param);
	}

	@Override
	public Integer deleteComment(String id, String uId) {
		Comment commentById = commentService.getCommentById(Integer.parseInt(uId));
		if(commentById.getUId().equals(uId)){
			return commentService.deleteCommentById(Integer.parseInt(uId));
		}
		return null;
	}
	

}
