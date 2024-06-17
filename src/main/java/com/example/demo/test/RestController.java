package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {

	@GetMapping(value = "/helloWorld")
	public String hellowWorld() {
		return "Hello World";
	}
}
