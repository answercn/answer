package com.david122.answer.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david122.answer.annotation.IgnoreSecurity;
import com.david122.answer.model.Role;
import com.david122.answer.service.RoleService;

/**
 * Created by WangHui on 17/12/01.
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    private static final Logger logger = LogManager.getLogger(RoleController.class);

    @Autowired
    RoleService roleService;

    @RequestMapping("/selectByPrimaryKey/{key}")
    @IgnoreSecurity
    public Role selectByPrimaryKey(@PathVariable(name = "key") String key) {
        Role role = roleService.selectByPrimaryKey(key);
        return role;
    }

}