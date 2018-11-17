package com.jp.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.greet.dao.GreetingDAO;

@Service
public class GreetingManager {

	@Autowired
	private GreetingDAO greetingDao;
	
	public String greet(final String name) {
		return greetingDao.greet(name);
	}
}
