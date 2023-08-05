package com.policy.selection.mapper;

import com.policy.selection.dto.PolicySelectionDto;
import com.policy.selection.entity.PolicySelection;

public class PolicySelectionMapper {
	
	public static PolicySelectionDto PolicySelectionToDto(PolicySelection policySelection) {
		PolicySelectionDto policySelectionDto = new PolicySelectionDto(policySelection.getpolicySelectionId(),
				policySelection.getPid(),
				policySelection.getCustomerName(),
				policySelection.getEmail(),
				policySelection.getPolicyBenefits(),
				policySelection.getSelectedPolicyDuration());
		return policySelectionDto;
	}
	
	public static PolicySelection dtoToPolicySelection(PolicySelectionDto policySelectionDto) {
		PolicySelection policySelection = new PolicySelection(policySelectionDto.getPolicySelectionId(),
				policySelectionDto.getPid(),
				policySelectionDto.getCustomerName(),
				policySelectionDto.getEmail(),
				policySelectionDto.getPolicyBenefits(),
				policySelectionDto.getSelectedPolicyDuration());
		return policySelection;
	}

}
