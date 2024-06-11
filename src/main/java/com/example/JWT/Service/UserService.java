package com.example.JWT.Service;

import com.example.JWT.Model.UserModel;
import com.example.JWT.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public List<UserModel> getAllUsers() {
        return (List<UserModel>) repository.findAll();

    }
}