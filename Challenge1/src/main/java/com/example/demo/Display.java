package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display {

	@GetMapping(value = "/")
	public String getCurrrentDateTime() {
		LocalDateTime currentdate = LocalDateTime.now();
		return "Current Date & Time : " + currentdate;

	}
}
