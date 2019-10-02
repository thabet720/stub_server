package com.bluei.indoor;

import com.bluei.indoor.entities.User;

public class AuthToken {

    private String token;
    private User user;

    public AuthToken(){

    }
    
    public AuthToken(String token, User user) {
		super();
		this.token = token;
		this.user = user;
	}

	public AuthToken(String token){
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    

}