package com.photopolio.api.Controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.photopolio.api.Service.oauthSerivce;

import reactor.core.publisher.Mono;

@Component
public class MetroFilter implements Filter{
	
	@Autowired
	WebClientController Client;
	
	@Autowired
	oauthSerivce serv;
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException , ServletException {
		System.out.println("filter 들어옴");
		
		//Mono<?> t = Client.getUrl.get().uri("/oauth/{id}/{pw}").accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);
		//t.block();
		
		
		chain.doFilter(request, response);
	}
}
