package com.david122.answer.dao;

import com.david122.answer.model.Role;

public interface IRoleDao {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table role
     * @mbg.generated  Thu Jan 11 13:37:36 CST 2018
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table role
     * @mbg.generated  Thu Jan 11 13:37:36 CST 2018
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table role
     * @mbg.generated  Thu Jan 11 13:37:36 CST 2018
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table role
     * @mbg.generated  Thu Jan 11 13:37:36 CST 2018
     */
    Role selectByPrimaryKey(String roleId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table role
     * @mbg.generated  Thu Jan 11 13:37:36 CST 2018
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table role
     * @mbg.generated  Thu Jan 11 13:37:36 CST 2018
     */
    int updateByPrimaryKey(Role record);
}