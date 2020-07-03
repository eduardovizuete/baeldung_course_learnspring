package com.baeldung.taskmanagementapplesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.taskmanagementapplesson.service.IProjectService;

@SpringBootApplication
public class LsApplication {
	
    @Autowired
    private IProjectService projectService;
	
	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}
	
}
