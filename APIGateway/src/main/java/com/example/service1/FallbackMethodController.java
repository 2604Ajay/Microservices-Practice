package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

	@GetMapping("/userfallbackmethod")
	public String userServiceFallbackMethod() {
		return "User service is taking longer than expected";
	}
	
	@GetMapping("/departmentfallbackmethod")
	public String departmentServiceFallbackMethod() {
		return "Department service is taking longer than expected";
	}
}
