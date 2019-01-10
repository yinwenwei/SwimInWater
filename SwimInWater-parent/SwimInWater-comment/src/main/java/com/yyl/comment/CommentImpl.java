package com.yyl.comment;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyl.api.comment.CommentApi;
import com.yyl.comment.service.CommentService;
import com.yyl.entity.Comment;
import com.yyl.entity.PageBean;
@Service
public class CommentImpl implements CommentApi{
	@Resource
	private CommentService commentService;
	@Override
	public Comment getCommentById(Integer id) {
		return commentService.getCommentById(id);
	}
	@Override
	public List<Comment> getCommentListByMap(Map<String, Object> param) {
		return commentService.getCommentListByMap(param);
	}
	@Override
	public Integer getCommentCountByMap(Map<String, Object> param) {
		return commentService.getCommentCountByMap(param);
	}
	@Override
	public Integer addComment(Comment comment) {
		return commentService.addComment(comment);
	}
	@Override
	public Integer modifyComment(Comment comment) {
		return commentService.modifyComment(comment);
	}

	@Override
	public Integer deleteCommentById(Integer id) {
		return commentService.deleteCommentById(id);
	}

	@Override
	public PageBean<Comment> queryCommentPageByMap(Map<String, Object> param,
			Integer size, Integer cur) {
		return commentService.queryCommentPageByMap(param, size, cur);
	}

}
