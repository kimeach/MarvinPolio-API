package com.photoPolio.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoPolio.api.Model.User;
import com.photoPolio.api.Repository.UserRepository;

@Service
public class userService {

	@Autowired
	UserRepository repo;
	
	public List<User> getUserAll(){
		//user 전체 조회
		return repo.findAll();
	}
	public String getUserIdAndPw(String id,String password){
		List<User> value = repo.findByIdAndPassword(id, password);
		if(!value.isEmpty()) {
			return "true";
		}else {
			return "false";
		}
	}
}
