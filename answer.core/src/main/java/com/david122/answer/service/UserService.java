package com.david122.answer.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david122.answer.dao.IRoleDao;
import com.david122.answer.dao.IUserDao;
import com.david122.answer.model.Role;
import com.david122.answer.model.User;

@Service
public class UserService {
	
	private static final Logger logger = LogManager.getLogger(UserService.class);
    
    @Autowired
	IUserDao userDao;
    
    @Autowired
    IRoleDao roleDao;
    
    public List<User> getUserList() {
    	
    	logger.warn("ccccccccccccccccccccccccccc");
    	return userDao.getUserList();
    }
    
    
    public Role selectByPrimaryKey(String key) {
        
        logger.warn("bbbbbbb");
        return roleDao.selectByPrimaryKey(key);
    }
}
