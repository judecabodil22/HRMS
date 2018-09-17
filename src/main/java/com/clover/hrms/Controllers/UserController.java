package com.clover.hrms.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clover.hrms.Model.User;
import com.clover.hrms.Repositories.UserRepository;
import com.clover.hrms.exception.ResourceNotFoundException;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserRepository userRep;
	
	@GetMapping("/users")
	public List<User> getAllUser()
	{
		return userRep.findAll();
	}
	
	@PostMapping("/users")
	public @Valid User addUser(@Valid @RequestBody User user)
	{
		return userRep.save(user);
	}
	
	@GetMapping("/users/{userId}")
	public @Valid User findUserById(@PathVariable(value="userId") Long id)
	{     
		return userRep.findById(id).orElseThrow(()-> new ResourceNotFoundException("bla","blo",id));
	}
	
	

}
