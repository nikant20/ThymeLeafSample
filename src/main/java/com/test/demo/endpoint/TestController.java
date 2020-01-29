package com.test.demo.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.demo.model.TestModel;
import com.test.demo.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/hello")
	public ModelAndView getResponse(Model model) {
		List<TestModel> response = testService.giveResponse();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showNames");
		mv.addObject("names", response);
		return mv;
	}
	
	@GetMapping("/signin")
	public String signIn(Model model) {
		return "index";
	}
	
	

}
