package com.jp.greet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jp.greet.GreetingManager;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GreetingController {

	@Autowired
	private  GreetingManager greetingManager;
	
	@GetMapping("/greet/{name}")
	public String greeat(@PathVariable final String name) {
		System.out.println("---in controller--");
		return greetingManager.greet(name);
	}
}
