package com.policy.selection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policy.selection.dto.ApiResponseDto;
import com.policy.selection.dto.PolicySelectionDto;
import com.policy.selection.service.PolicySelectionService;

@RestController
@RequestMapping("api/policies/select")
public class PolicySelectionController {
	@Autowired
	private PolicySelectionService policySelectionService;
	
	
	@PostMapping
	public ResponseEntity<PolicySelectionDto> saveSelectedPolicies(@RequestBody PolicySelectionDto policySelectionDto){
		return new ResponseEntity<PolicySelectionDto>(policySelectionService.saveSelectedPolicy(policySelectionDto), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ApiResponseDto> getEmployeeById(@PathVariable("id") String policySelectionId){
		ApiResponseDto apiResponseDto= policySelectionService.getSelectedPolicyDetails(policySelectionId);
		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}
	

}
