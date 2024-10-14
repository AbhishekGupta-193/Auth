package com.user.auth.controller;

import com.user.auth.model.user;
import com.user.auth.service.authService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping("auth")
public class authController {

    @Autowired
    authService authService;
    @GetMapping("/getUsers")
    public ResponseEntity<List<user>> getAllUsers(){
        return authService.getAllUsers();
    }

    @PostMapping("/registerUser")
    public ResponseEntity<String> registerUser(@RequestBody user user){
        return authService.registerUser(user);
    }

    @PostMapping("/loginUser")
    public ResponseEntity<user> loginUser(@RequestBody Map<String,String> loginReq){
        String mobileNo=loginReq.get("mobileNo");
        String password=loginReq.get("password");
        return authService.loginUser(mobileNo,password);
    }

}
