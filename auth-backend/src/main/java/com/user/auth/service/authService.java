package com.user.auth.service;

import com.user.auth.dao.authDao;
import com.user.auth.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class authService {

    @Autowired
    authDao authDao;
    public ResponseEntity<List<user>> getAllUsers() {
        try{
            return new ResponseEntity<>(authDao.findAll(),HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> registerUser(user user) {
        try {
            authDao.save(user);
            return new ResponseEntity<>("{\"message\": \"success\"}", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("{\"message\": \"Internal Server Error\"}", HttpStatus.INTERNAL_SERVER_ERROR);
    }


    public ResponseEntity<user> loginUser(String mobileNo, String password) {
        try{
            user user = authDao.findByMobileNo(mobileNo);
            if(user!=null && user.getPassword().equals(password)){
                return new ResponseEntity<>(user,HttpStatus.OK);
            }else{
                return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
