package com.david122.answer.model;

import java.io.Serializable;

/**
 * Created by WangHui on 17/12/01.
 */
//@Document(collection = "User")
public class User implements Serializable {

	private static final long serialVersionUID = 833156132506297007L;
	
	private String userId;
    private String userName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
