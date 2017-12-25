package com.david122.answer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david122.answer.dao.IUserDao;
import com.david122.answer.dao.UserDao;
import com.david122.answer.model.User;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    
    @Autowired
	IUserDao iuserDao;

    public User getUser(String name){
        return userDao.getUser(name);

    }

    public User saveUser(String name,String age){
        return userDao.saveUser(name,age);

    }
    
    public List<User> getUserList() {
    	return iuserDao.getUserList();
    }
}
