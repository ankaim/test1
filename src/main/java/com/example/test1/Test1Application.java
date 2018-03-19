package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

	@Autowired
	public void config(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.inMemoryAuthentication().withUser("user")
				.password("pass")
				.roles("USER");
	}

}
