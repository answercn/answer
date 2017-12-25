package com.david122.answer.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ali.seal.sealing.model.User;

//暂时无法跑service的junit，可以从controller的junit测试
@RunWith(SpringRunner.class)
@SpringBootTest(classes=UserService.class)
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	@Test
	public void testGetUserList() throws Exception {
		List<User> userList = userService.getUserList();

		Assert.assertEquals(1, userList.size());
	}
}
