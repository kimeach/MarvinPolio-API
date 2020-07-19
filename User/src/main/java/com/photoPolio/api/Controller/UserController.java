package com.photoPolio.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.photoPolio.api.Model.User;
import com.photoPolio.api.Service.userService;

@Controller
/* @RequestMapping("/index") */
public class UserController {

	@Autowired
	userService serv;
	
	
	@GetMapping("/user")
	public ModelAndView getIndex() {
		ModelAndView mav =new ModelAndView("index");
		System.out.println("값 : "+serv.getUserAll());
		
		List<User> list = serv.getUserAll();
		
		for(User arr : list) {
			System.out.println("a : "+arr);
		}
		return mav;
	}

	@GetMapping("/userA")
	public ResponseEntity<List<User>> getA() {
		
		List<User> list = serv.getUserAll();
		
		/*
		 * for(int i=0;i<list.size();i++) { System.out.println("a : "+list.get(i)); }
		 */
		
		for(User arr : list) {
			System.out.println("aa : "+arr.toString());
			
		}
		return new ResponseEntity<List<User>>(serv.getUserAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> postUser(){
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	
	
}
