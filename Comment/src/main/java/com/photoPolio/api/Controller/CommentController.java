package com.photoPolio.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.photoPolio.api.Model.Comment;
import com.photoPolio.api.Service.CommentService;

@Controller
@RequestMapping("Comment")
public class CommentController {

	@Autowired
	CommentService serv;
	
	@GetMapping("/{id}/{password}")
	public ResponseEntity<String> getUser(@PathVariable("id") String id , @PathVariable("password") String password) {
		
		return new ResponseEntity<String>(serv.getUserIdAndPw(id,password),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> postUser(){
		
		return new ResponseEntity<>(serv.getUserAll(),HttpStatus.OK);
	}
	
	
	
}
