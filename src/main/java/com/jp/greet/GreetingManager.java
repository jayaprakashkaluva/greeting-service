package com.jp.greet;

import org.springframework.stereotype.Service;

@Service
public class GreetingManager {

	public String greet(final String name) {
		return "Hello ".concat(name);
	}
}
