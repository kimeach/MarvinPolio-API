package com.photoPolio.api.Service;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.photoPolio.api.Model.Login;
import com.photoPolio.api.Repository.LoginRepository;
import com.photopolio.api.Controller.MetroWebClient;
import com.photopolio.api.Controller.WebClientController;

import reactor.core.publisher.Mono;

@Service
public class LoginService {
	
	private static final Logger log = LoggerFactory.getLogger(LoginService.class);
	@Autowired
	LoginRepository repo;
	
	@Autowired
	WebClientController Client;
	
	public List<Login> getUserAll(){
		//user 전체 조회
		return repo.findAll();
	}
	public String getUserIdAndPw(String id,String password){
		Login login = repo.findById(id).orElse(null);
		
		if(login != null) { //값이  null 이 아닐때
			log.info("null 아니다");
			if(login.getId().equals(id)) {
				if(login.getPassword().equals(password)) {
					 
					//webClient 로 jwt 생성
					Mono<?> t = Client.getUrl.get().uri("/oauth/{id}/{pw}",id,password).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
					log.info(t.block().toString());
					return t.block().toString();
				}
			}
		}
		
		else { // 값이 null 일 때
			log.info("null 이다.");
			return "false";
		}
		return "false";
	
	}
}
