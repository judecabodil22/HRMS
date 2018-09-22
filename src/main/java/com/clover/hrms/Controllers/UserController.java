package com.clover.hrms.Controllers;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.clover.hrms.Model.User;
import com.clover.hrms.Repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRep;
	
	@GetMapping("/usersSelect")
	public List<User> getAllUser()
	{		
		return userRep.findAll();	
	}	
	
	@GetMapping("/register")
	public @Valid ModelAndView forPageScreen(@ModelAttribute("user") User user)
	{	
		ModelAndView users = new ModelAndView("registrationPage");
		return users;
	}
	
	@ResponseBody
	@PostMapping("/register")
	public @Valid User addUser(@RequestBody User user)
	{
		return  userRep.save(user);	
	}
	
/*	@GetMapping("/register/users/{userId}")
	public @Valid User findUserById(@PathVariable(value="userId") Long id)
	{     
		return userRep.findById(id).orElseThrow(()-> new ResourceNotFoundException("bla","blo",id));
	}
	
	@DeleteMapping("/register/users/remove/{userId}")
	public void removeUser(@PathVariable long userId)
	{
		userRep.deleteById(userId);
	}
	
*/
	
	

}
