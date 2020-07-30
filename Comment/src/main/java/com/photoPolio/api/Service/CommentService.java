package com.photoPolio.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoPolio.api.Model.Comment;
import com.photoPolio.api.Repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	CommentRepository repo;
	
	public List<Comment> getUserAll(){
		//user 전체 조회
		return repo.findAll();
	}
	public String getUserIdAndPw(String id,String password){
		List<Comment> value = repo.findByIdAndPassword(id, password);
		if(!value.isEmpty()) {
			return "true";
		}else {
			return "false";
		}
	}
}
