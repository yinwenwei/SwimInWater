package com.yyl.comment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yyl.api.comment.CommentApi;
import com.yyl.comment.service.CommentService;
import com.yyl.entity.Comment;
/**
 * 
* @ClassName: CommentImpl
* @Description: 实现评论相关功能
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
		return null;
	}

	@Override
	public List<Comment> queryComment(String sId) {
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("id", "1");
		return commentService.getCommentListByMap(hashMap);
	}

	@Override
	public Integer deleteComment(String id) {
		return null;
	}
	

}
