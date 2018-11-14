package com.jp.greet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jp.greet.GreetingManager;

@RestController
public class GreetingController {

	@Autowired
	private  GreetingManager greetingManager;
	
	public String greeat(@PathVariable final String name) {
		return greetingManager.greet(name);
	}
}
