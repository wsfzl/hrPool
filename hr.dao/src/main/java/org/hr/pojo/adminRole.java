package org.hr.pojo;

import java.io.Serializable;

public class adminRole implements Serializable {
	
	private Integer id;
	
	private Integer adminId;
	
	private Integer roleId;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getId() {
		return id;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public Integer getRoleId() {
		return roleId;
	}
	
	
}
