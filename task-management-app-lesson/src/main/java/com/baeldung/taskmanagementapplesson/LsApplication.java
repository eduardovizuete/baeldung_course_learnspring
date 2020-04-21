package com.baeldung.taskmanagementapplesson;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}
	
	 @PostConstruct
	 public void postConstruct() {
		 //
	 }

}
