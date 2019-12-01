package com.myjavablog.service;

import com.myjavablog.dao.UserDao;
import com.myjavablog.pojo.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List getUserDetails() {

        return userDao.getUserDetails();
    }
}
