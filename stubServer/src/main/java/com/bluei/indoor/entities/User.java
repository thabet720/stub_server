package com.bluei.indoor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User   {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String username;
    private String password;
    @JsonProperty("location_id")
    private int locationId;
    private String role;

    public User() {
    }

    public User(String username, String password, int locationId) {
        this.username = username;
        this.password = password;
        this.locationId = locationId;
    }
    
 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }


    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
      
    }
    

    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", locationId=" + locationId +
                '}';
    }
}
