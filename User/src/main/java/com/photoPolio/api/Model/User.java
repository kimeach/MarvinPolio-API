package com.photoPolio.api.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity

@Table(name="user")
//@IdClass

public class User {
public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

public User() {
}

public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

@Id
@Column(name = "id")
private String id;

@Column(name = "password")
private String password;

@Column(name = "name")
private String name;

	
}
