package com.david122.answer.dao;

import org.springframework.stereotype.Component;

import com.david122.answer.model.User;

/**
 * Created by WangHui on 17/12/01.
 */
@Component
public class UserDao {


    public User getUser(String name) {
    	User user = new User();
    	user.setUserId("111111");
    	user.setUserName("11name1111");
        return user;
    }

    public User saveUser(String name,String age){
    	User user = new User();
    	user.setUserId("222222");
    	user.setUserName("22name2222");
        return user;
    }
}
