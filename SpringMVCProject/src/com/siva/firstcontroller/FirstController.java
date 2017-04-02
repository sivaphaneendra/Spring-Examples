package com.siva.firstcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class FirstController {
	
	@RequestMapping("/hello/{username}")
	public ModelAndView helloWorld(@PathVariable("username")String name){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "Message from first controller, Hi "+ name);
		
		return mv;
	}
}
