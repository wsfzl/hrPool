package org.hr.pojo;

import java.io.Serializable;

public class userState implements Serializable {

	private Integer id;
	
	private String staName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStaName() {
		return staName;
	}

	public void setStaName(String staName) {
		this.staName = staName;
	}
	
	 
}
