package com.policy.selection.service.impl;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.policy.selection.dto.ApiResponseDto;
import com.policy.selection.dto.PolicyDto;
import com.policy.selection.dto.PolicySelectionDto;
import com.policy.selection.entity.PolicySelection;
import com.policy.selection.mapper.PolicySelectionMapper;
import com.policy.selection.repository.PolicySelectionRepository;
import com.policy.selection.service.PolicySelectionService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@Service
public class PolicySelectionImpl implements PolicySelectionService{
	//private  static final Logger LOGGER=  LoggerFactory.getLogger(PolicySelectionImpl.class);


	@Autowired
	PolicySelectionRepository policySelectionRepository;
	
	@Autowired
	private ApiClient apiClient;
	
	
	@Override
	public PolicySelectionDto saveSelectedPolicy(PolicySelectionDto policySelectionDto) {
		PolicySelection policySelection = PolicySelectionMapper.dtoToPolicySelection(policySelectionDto);
		String id= UUID.randomUUID().toString();
		policySelection.setpolicySelectionId(id);
		PolicySelection savedPolicy = policySelectionRepository.save(policySelection);
		return PolicySelectionMapper.PolicySelectionToDto(savedPolicy) ;
	}

	@Override
	@CircuitBreaker(name="${spring.application.name}", fallbackMethod = "getDefaultPolicySelection")
	public ApiResponseDto getSelectedPolicyDetails(String customerId) {
		
		PolicySelection policySelection=  policySelectionRepository.findById(customerId).get();
		
		//PolicyDto policyDto= apiClient.getPolicy(policySelection.getPid());
		PolicyDto policyDto= new PolicyDto("123","Shaheen","Helath",12000D);
		PolicySelectionDto policySelectionDto = PolicySelectionMapper.PolicySelectionToDto(policySelection);
		ApiResponseDto apiResponseDto = new ApiResponseDto();
		apiResponseDto.setPolicySelectionDto(policySelectionDto);
		apiResponseDto.setPolicy(policyDto);	
		return apiResponseDto;
	}
	
	public ApiResponseDto getDefaultPolicySelection(String customerId, Exception exception) {
		PolicySelection policySelection= policySelectionRepository.findById(customerId).get();
		PolicySelectionDto policySelectionDto= new PolicySelectionDto(policySelection.getpolicySelectionId(),
				policySelection.getPid(),
				policySelection.getCustomerName(),
				policySelection.getEmail(),
				policySelection.getPolicyBenefits(),
				policySelection.getSelectedPolicyDuration());
		
		
		PolicyDto policyDto = new PolicyDto();
		policyDto.setPid("7878787Fd");
		policyDto.setName("LIC policy");
		policyDto.setType("Health");
		policyDto.setAmount(12000D);
		
		ApiResponseDto apiResponseDto = new ApiResponseDto();
		apiResponseDto.setPolicySelectionDto(policySelectionDto);
		apiResponseDto.setPolicy(policyDto);
		
		return apiResponseDto;
		
	}

}
