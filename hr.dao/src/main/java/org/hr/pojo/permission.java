package org.hr.pojo;

import java.io.Serializable;

public class permission implements Serializable {

	private Integer id;
	
	private String name;
	
	private String type;
	
	private String url;
	
	private String percode;
	
	private Integer parentid;
	
	private String parentids;
	
	private String sortstring;
	
	private  String availble;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPercode() {
		return percode;
	}

	public void setPercode(String percode) {
		this.percode = percode;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getParentids() {
		return parentids;
	}

	public void setParentids(String parentids) {
		this.parentids = parentids;
	}

	public String getSortstring() {
		return sortstring;
	}

	public void setSortstring(String sortstring) {
		this.sortstring = sortstring;
	}

	public String getAvailble() {
		return availble;
	}

	public void setAvailble(String availble) {
		this.availble = availble;
	}
	
	
}
