package org.hr.pojo;

import java.io.Serializable;

public class education implements Serializable {
	
	private Integer id;
	
	private String aduName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAduName() {
		return aduName;
	}

	public void setAduName(String aduName) {
		this.aduName = aduName;
	}
	
	
}
