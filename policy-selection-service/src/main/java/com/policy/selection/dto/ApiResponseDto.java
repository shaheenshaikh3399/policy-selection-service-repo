package com.policy.selection.dto;


public class ApiResponseDto {

	private PolicyDto policy;
	private PolicySelectionDto policySelectiondto;
	public ApiResponseDto() {
		
	}
	public ApiResponseDto(PolicyDto policy, PolicySelectionDto policySelectiondto) {
		super();
		this.policy = policy;
		this.policySelectiondto = policySelectiondto;
	}
	public PolicyDto getPolicy() {
		return policy;
	}
	public void setPolicy(PolicyDto policy) {
		this.policy = policy;
	}
	public PolicySelectionDto getPolicySelectionDto() {
		return policySelectiondto;
	}
	public void setPolicySelectionDto(PolicySelectionDto policySelectiondto) {
		this.policySelectiondto = policySelectiondto;
	}

	
	
}
