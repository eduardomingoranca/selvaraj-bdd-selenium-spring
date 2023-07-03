package com.selvaraj.brazil.springselenium;

import com.selvaraj.brazil.springselenium.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;

	@Test
	void contextLoads() {
		user.printDetails();
	}

}
