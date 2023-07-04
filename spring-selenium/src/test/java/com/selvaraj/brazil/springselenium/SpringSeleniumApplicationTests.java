package com.selvaraj.brazil.springselenium;

import com.github.javafaker.Faker;
import com.selvaraj.brazil.springselenium.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;

	@Autowired
	private Faker faker;

	@Test
	void contextLoads() {
		this.user.printDetails();
	}

}
