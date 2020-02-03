package com.example.TestSpringwithSQL.ServiceInterfaces;

import com.example.TestSpringwithSQL.Model.UserModel;

public interface UserServiceInterface {
	
	public Iterable<UserModel> getall();
	public UserModel adduser(UserModel user);

}
