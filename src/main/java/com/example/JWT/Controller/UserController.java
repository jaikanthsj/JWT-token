package com.example.JWT.Controller;

import com.example.JWT.Model.UserModel;
import com.example.JWT.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers(){
        List<UserModel> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

//    @GetMapping("/me")
//    public ResponseEntity<UserModel> authenticatedUser() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        UserModel currentUser = (UserModel) authentication.getPrincipal();
//        return ResponseEntity.ok(currentUser);
//    }
}