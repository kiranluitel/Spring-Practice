package com.kiran.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {

	@GetMapping("/hello")
	public String hello() {
		
		return "hello-world";
	}
	@GetMapping("/workout")
	public String workout() {
		
		return "run a hard 5k";
	}
	
	@GetMapping("/fortune")
	public String fortune() {
		
		return "Your lucky day";
	}
}
