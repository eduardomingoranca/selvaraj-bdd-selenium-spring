package com.selvaraj.brazil.springselenium;

import com.selvaraj.brazil.springselenium.model.Address;
import com.selvaraj.brazil.springselenium.model.Salary;
import com.selvaraj.brazil.springselenium.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	// user, salary and address

	@Test
	void contextLoads() {
		Address address = new Address();
		Salary salary = new Salary();

		User user = new User(address, salary);
		user.printDetails();
	}

}
