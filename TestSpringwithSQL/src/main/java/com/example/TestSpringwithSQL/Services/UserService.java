package com.example.TestSpringwithSQL.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestSpringwithSQL.Model.UserModel;
import com.example.TestSpringwithSQL.Repository.UserRepo;
import com.example.TestSpringwithSQL.ServiceInterfaces.UserServiceInterface;

@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepo repo;
	
	@Override
	public Iterable<UserModel> getall() {
		return repo.findAll();
	}
	
	@Override
	public UserModel adduser(UserModel user) {
		return repo.save(user);
	}

}
