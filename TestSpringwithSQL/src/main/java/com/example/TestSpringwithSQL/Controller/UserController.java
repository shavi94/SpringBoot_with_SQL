package com.example.TestSpringwithSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestSpringwithSQL.Model.UserModel;
import com.example.TestSpringwithSQL.Services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public Iterable<UserModel> getAll() {
		return service.getall();
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public UserModel adduser(@RequestBody UserModel user) {
		return service.adduser(user);
	}

}
