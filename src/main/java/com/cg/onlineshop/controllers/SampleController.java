package com.cg.onlineshop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/")
	public String sayHello() {
		return "hello To All";
	}
	@RequestMapping("/test")
	public String testService() {
		return "Just Check in Service It's Working";
	}
}