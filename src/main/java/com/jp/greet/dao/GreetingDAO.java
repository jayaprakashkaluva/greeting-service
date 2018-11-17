package com.jp.greet.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class GreetingDAO {

	@Autowired
	private RestTemplate restTemplate;
	
	public String greet(final String name) {
		return restTemplate.getForEntity("http://greeting-service:8080/greet?name={use}", String.class, name).getBody();
	}
}
