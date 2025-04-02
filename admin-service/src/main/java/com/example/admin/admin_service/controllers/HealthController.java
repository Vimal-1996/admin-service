package com.example.admin.admin_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/health")
	public String healthCheck() {
		return "admin Service is setup and running fine";
	}

}
