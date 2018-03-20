package org.hr.pojo;

import java.io.Serializable;
import java.util.Date;

public class audit implements Serializable {

	private Integer id;
	
	private Integer traId;
	
	private Integer userAuditId;
	
	private String result;
	
	private Date time;
	
	private String remark;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTraId(Integer traId) {
		this.traId = traId;
	}

	public void setUserAuditId(Integer userAuditId) {
		this.userAuditId = userAuditId;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public Integer getTraId() {
		return traId;
	}

	public Integer getUserAuditId() {
		return userAuditId;
	}

	public String getResult() {
		return result;
	}

	public Date getTime() {
		return time;
	}

	public String getRemark() {
		return remark;
	}
	
	
}
