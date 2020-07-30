package com.photopolio.api.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/{param}/{request}")
	public ResponseEntity<?> getAPI1(@PathVariable("param") String param , @PathVariable("request") String request){
		System.out.println("common 들어옴");
		System.out.println("param : "+param);
		System.out.println("request : "+request);
		
		return new ResponseEntity<>("",HttpStatus.OK);
	}

	
	@GetMapping("/{param}/{request}/{request2}")
	public ResponseEntity<?> getAPI(@PathVariable("param") String param , @PathVariable("request") String request, @PathVariable("request2") String request2){
		System.out.println("common 들어옴");
		System.out.println("param : "+param);
		System.out.println("request : "+request);
		System.out.println("request2 : "+request2);
		
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	
	
	@PostMapping("/{param}/{request}/{request2}")
	public ResponseEntity<?> postAPI(@PathVariable("param") String param , @PathVariable("request") String request, @PathVariable("request2") String request2){
		System.out.println("common 들어옴");
		System.out.println("param : "+param);
		System.out.println("request : "+request);
		System.out.println("request2 : "+request2);
		
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	
	
}
