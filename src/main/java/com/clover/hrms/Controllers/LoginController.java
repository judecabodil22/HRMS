package com.clover.hrms.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

	
	@GetMapping("/login")
	public ModelAndView loginPage()
	{
		ModelAndView mav = new ModelAndView("LoginPage");
		return mav;
	}
	
	
	
	
}
