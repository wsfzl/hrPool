package org.hr.pojo;

import java.io.Serializable;
import java.util.Date;

public class admin implements Serializable {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String salt;
	
	private Date createTime;
	
	private Integer userCreateId;
	
	private Integer userId;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setUserCreateId(Integer userCreateId) {
		this.userCreateId = userCreateId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getSalt() {
		return salt;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Integer getUserCreateId() {
		return userCreateId;
	}

	public Integer getUserId() {
		return userId;
	}
	
	
}
