package org.hr.pojo;

import java.io.Serializable;

public class jobtitle implements Serializable {

	private Integer id;
	
	private String jobName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	
}
