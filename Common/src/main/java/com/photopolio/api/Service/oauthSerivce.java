package com.photopolio.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photopolio.api.Model.oauth;
import com.photopolio.api.Repository.oauthRepository;

@Service
public class oauthSerivce {
	
	@Autowired
	oauthRepository repo;
		
	public oauth getOauth() {
		oauth o = new oauth();
		return repo.findById(o.getId()).orElse(null);
	}
}
