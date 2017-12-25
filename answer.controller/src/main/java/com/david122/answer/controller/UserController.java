package com.david122.answer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ali.seal.sealing.model.User;
import com.ali.seal.sealing.service.UserService;

/**
 * Created by WangHui on 17/12/01.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
    // 临时测试接口
    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable(name = "name")String name){
        return "Hello World" + name;
    }
    
    @RequestMapping("/getUserList")
	public List<User> getUserList() {
		List<User> users=userService.getUserList();
		return users;
	}
    
    @RequestMapping(value = "/getUserInfo/{id}",method = RequestMethod.GET)
    public User getUserInfo(@PathVariable(name = "id")String id, ModelMap modelMap){
        User user= userService.getUser(id);
        return user;
    }

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    public void saveUser(User user){
    	userService.saveUser("1","1");
    }
    
}