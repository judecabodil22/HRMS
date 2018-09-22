package com.clover.hrms.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PracticeController {

	@GetMapping("/practice")
	public ModelAndView view(@ModelAttribute("practice") String practice)
	{
		ModelAndView mav = new ModelAndView("Practice");
		
		return mav;
	}
	
	@GetMapping("/getHello")
	public String postView(@ModelAttribute("practice") String practice)
	{
		return "hello";
	}
	
	
}
