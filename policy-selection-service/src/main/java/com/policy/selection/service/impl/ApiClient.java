package com.policy.selection.service.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.policy.selection.dto.PolicyDto;

@FeignClient(name="POLICY-SERVICE")
public interface ApiClient {
  @GetMapping("/policies/{pid}")
  PolicyDto getPolicy(@PathVariable("pid") String pid);

}
