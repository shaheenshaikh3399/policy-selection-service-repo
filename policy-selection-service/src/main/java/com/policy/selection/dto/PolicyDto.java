package com.policy.selection.dto;

import lombok.Builder;

@Builder
public class PolicyDto {
	String pid;
	String name;
	String type;
	Double amount;
	public PolicyDto() {
		
	}
	public PolicyDto(String pid, String name, String type, Double amount) {
		super();
		this.pid = pid;
		this.name = name;
		this.type = type;
		this.amount = amount;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
 	
}
