package com.photoPolio.api.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
/* @RequestMapping("/index") */
public class IndexController {

	@GetMapping("/index")
	public ModelAndView getIndex() {
		ModelAndView mav =new ModelAndView("index");
		return mav;
	}

	
}
