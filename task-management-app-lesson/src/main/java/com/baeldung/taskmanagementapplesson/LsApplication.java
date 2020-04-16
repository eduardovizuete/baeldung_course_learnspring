package com.baeldung.taskmanagementapplesson;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LsApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(new Class[] {LsApplication.class, Config.class}, args);
		context.close();
	}

}
