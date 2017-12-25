package com.david122.answer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.seal.sealing.dao.IUserDao;
import com.ali.seal.sealing.dao.UserDao;
import com.ali.seal.sealing.model.User;

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
