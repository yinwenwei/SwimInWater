package com.yyl.comment.service;

import org.springframework.stereotype.Service;

import com.yyl.comment.repository.CommentMapper;
import com.yyl.entity.Comment;
import com.yyl.entity.PageBean;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
/**
 * 
* @ClassName: CommentServiceImpl
* @Description: 评论业务相关
* @author lkw
* @date 2019年1月10日 上午9:02:56
*
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    public Comment getCommentById(Integer id){
        try {
			 return commentMapper.getCommentById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public List<Comment> getCommentListByMap(Map<String,Object> param){
        try {
			return commentMapper.getCommentListByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer getCommentCountByMap(Map<String,Object> param){
        try {
			return commentMapper.getCommentCountByMap(param);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer addComment(Comment comment){
        try {
			return commentMapper.insertComment(comment);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer modifyComment(Comment comment){
        try {
			return commentMapper.updateComment(comment);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public Integer deleteCommentById(Integer id){
        try {
			return commentMapper.deleteCommentById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    public PageBean<Comment> queryCommentPageByMap(Map<String,Object> param,Integer size,Integer cur){
        try {
			Integer total = commentMapper.getCommentCountByMap(param);
            PageBean<Comment> pageBean = new PageBean<Comment>(total,size,cur);
            param.put("start", (pageBean.getCurrentPage()-1)*size);
            param.put("size", size);
            List<Comment> commentList = commentMapper.getCommentListByMap(param);
            pageBean.setList(commentList);
            return pageBean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
}
