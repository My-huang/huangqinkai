package com.huangqinkai.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huangqinkai.cms.dao.CommentMapper;
import com.huangqinkai.cms.domain.Comment;
import com.huangqinkai.cms.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentMapper;

	@Override
	public void save(Comment comment) {
		commentMapper.save(comment);
	}
}
