package com.clover.hrms.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.clover.hrms.Model.User;
import com.clover.hrms.Repositories.UserRepository;
import com.clover.hrms.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserRepository userRep;
	
	@GetMapping("/usersSelect")
	public List<User> getAllUser()
	{		
		return userRep.findAll();	
	}
	
	
	@GetMapping("/register")
	public @Valid ModelAndView forPage(@ModelAttribute("user") User user)
	{	
		ModelAndView users = new ModelAndView("registrationPage");
		return users;
	}
	
	
	@PostMapping("/register/success")
	public @Valid User addUser(@Valid @ModelAttribute("user") User user)
	{
		return  userRep.save(user);	
	}
	
	@GetMapping("/register/users/{userId}")
	public @Valid User findUserById(@PathVariable(value="userId") Long id)
	{     
		return userRep.findById(id).orElseThrow(()-> new ResourceNotFoundException("bla","blo",id));
	}
	
	@DeleteMapping("/register/users/remove/{userId}")
	public void removeUser(@PathVariable long userId)
	{
		userRep.deleteById(userId);
	}
	

	
	

}
