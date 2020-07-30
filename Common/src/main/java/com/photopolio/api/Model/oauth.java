package com.photopolio.api.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "oauth")
public class oauth {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="token")
	private String token;
	@Column(name="update_date" , insertable=false)
	@UpdateTimestamp
	private LocalDateTime updateDate;

	@Column(name="insert_date",updatable=false)
	@CreationTimestamp
	private LocalDateTime insertDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDateTime getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(LocalDateTime insertDate) {
		this.insertDate = insertDate;
	}

	public oauth(String id, String token, LocalDateTime updateDate, LocalDateTime insertDate) {
		this.id = id;
		this.token = token;
		this.updateDate = updateDate;
		this.insertDate = insertDate;
	}

	public oauth() {
	}
	
	
	
}
