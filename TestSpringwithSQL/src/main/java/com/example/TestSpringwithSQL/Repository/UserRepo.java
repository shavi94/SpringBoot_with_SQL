package com.example.TestSpringwithSQL.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.TestSpringwithSQL.Model.UserModel;

public interface UserRepo extends CrudRepository<UserModel, String> {

}
