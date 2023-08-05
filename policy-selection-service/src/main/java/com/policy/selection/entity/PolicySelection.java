package com.policy.selection.entity;

//import org.hibernate.annotations.DialectOverride.GeneratedColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SelectedPolicies")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PolicySelection {
	@Id
	String policySelectionId;
	String pid;
	String customerName;
	String email;
	String policyBenefits;
	String selectedPolicyDuration;
	public PolicySelection() {
		
	}
	public PolicySelection(String policySelectionId, String pid, String customerName, String email,
			String policyBenefits, String selectedPolicyDuration) {
		super();
		this.policySelectionId = policySelectionId;
		this.pid = pid;
		this.customerName = customerName;
		this.email = email;
		this.policyBenefits = policyBenefits;
		this.selectedPolicyDuration = selectedPolicyDuration;
	}
	public String getpolicySelectionId() {
		return policySelectionId;
	}
	public void setpolicySelectionId(String policySelectionId) {
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