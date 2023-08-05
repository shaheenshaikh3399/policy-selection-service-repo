package com.policy.selection.dto;

public class PolicySelectionDto {
	String policySelectionId;
	String pid;
	String customerName;
	String email;
	String policyBenefits;
	String selectedPolicyDuration;
	public PolicySelectionDto() {
		
	}
	public PolicySelectionDto(String policySelectionId, String pid, String customerName, String email,
			String policyBenefits, String selectedPolicyDuration) {
		super();
		this.policySelectionId = policySelectionId;
		this.pid = pid;
		this.customerName = customerName;
		this.email = email;
		this.policyBenefits = policyBenefits;
		this.selectedPolicyDuration = selectedPolicyDuration;
	}
	public String getPolicySelectionId() {
		return policySelectionId;
	}
	public void setPolicySelectionId(String policySelectionId) {
		this.policySelectionId = policySelectionId;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPolicyBenefits() {
		return policyBenefits;
	}
	public void setPolicyBenefits(String policyBenefits) {
		this.policyBenefits = policyBenefits;
	}
	public String getSelectedPolicyDuration() {
		return selectedPolicyDuration;
	}
	public void setSelectedPolicyDuration(String selectedPolicyDuration) {
		this.selectedPolicyDuration = selectedPolicyDuration;
	}
	
	
}