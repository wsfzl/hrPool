package org.hr.pojo;

import java.io.Serializable;

public class position implements Serializable {

	private Integer id;
	
	private String name;
	
	private Integer depId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	
	
}
