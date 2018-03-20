package org.hr.pojo;

import java.io.Serializable;
import java.util.Date;

public class contract implements Serializable {

	private Integer id;
	
	private Integer userId;
	
	private String name;
	
	private Date takeTime;
	
	private Date loseTime;
	
	private String state;
	
	private Date qiandingTime;
	
	private String upload;
	
	private String remark;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}

	public void setLoseTime(Date loseTime) {
		this.loseTime = loseTime;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setQiandingTime(Date qiandingTime) {
		this.qiandingTime = qiandingTime;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public Date getTakeTime() {
		return takeTime;
	}

	public Date getLoseTime() {
		return loseTime;
	}

	public String getState() {
		return state;
	}

	public Date getQiandingTime() {
		return qiandingTime;
	}

	public String getUpload() {
		return upload;
	}

	public String getRemark() {
		return remark;
	}
	
	
}
