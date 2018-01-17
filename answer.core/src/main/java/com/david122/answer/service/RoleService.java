package com.david122.answer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david122.answer.dao.IRoleDao;
import com.david122.answer.model.Role;

@Service
public class RoleService {

    private static final Logger logger = LogManager.getLogger(RoleService.class);

    @Autowired
    IRoleDao roleDao;

    public Role selectByPrimaryKey(String key) {

        logger.warn("bbbbbbb");
        return roleDao.selectByPrimaryKey(key);
    }
}
