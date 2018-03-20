package org.hr.pojo;

import java.io.Serializable;

public class department implements Serializable {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String desc;
	
	private Integer parentid;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getDesc() {
		return desc;
	}

	public Integer getParentid() {
		return parentid;
	}
	
	
}
