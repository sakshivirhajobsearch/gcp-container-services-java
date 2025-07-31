package com.gcp.container.services.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from GCP Container!";
	}
}