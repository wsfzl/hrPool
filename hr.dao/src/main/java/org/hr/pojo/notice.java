package org.hr.pojo;

import java.io.Serializable;
import java.util.Date;

public class notice implements Serializable {

	private Integer id;
	
	private String tile;
	
	private String content;
	
	private Integer issuerUserId;
	
	private Date startTime;
	
	private Date endTime;
	
	private String takein;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTile() {
		return tile;
	}

	public void setTile(String tile) {
		this.tile = tile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getIssuerUserId() {
		return issuerUserId;
	}

	public void setIssuerUserId(Integer issuerUserId) {
		this.issuerUserId = issuerUserId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getTakein() {
		return takein;
	}

	public void setTakein(String takein) {
		this.takein = takein;
	}
	
	
	
	
}
