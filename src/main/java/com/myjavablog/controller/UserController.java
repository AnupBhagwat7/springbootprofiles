package com.myjavablog.controller;

import com.myjavablog.pojo.UserDetails;
import com.myjavablog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity userDetails() {

        List userDetails = userService.getUserDetails();
        return new ResponseEntity(userDetails, HttpStatus.OK);
    }
}
