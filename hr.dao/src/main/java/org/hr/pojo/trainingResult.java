package org.hr.pojo;

import java.io.Serializable;

public class trainingResult implements Serializable {

	private Integer id;
	
	private Integer traId;
	
	private String advice;
	
	private String conclusion;
	
	private String result;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTraId() {
		return traId;
	}

	public void setTraId(Integer traId) {
		this.traId = traId;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
