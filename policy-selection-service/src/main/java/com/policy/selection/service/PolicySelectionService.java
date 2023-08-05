package com.policy.selection.service;

import org.springframework.stereotype.Service;

import com.policy.selection.dto.ApiResponseDto;
import com.policy.selection.dto.PolicySelectionDto;
@Service
public interface PolicySelectionService {
	PolicySelectionDto saveSelectedPolicy(PolicySelectionDto policySelectionDto);
	ApiResponseDto getSelectedPolicyDetails(String customerId);
	
}
