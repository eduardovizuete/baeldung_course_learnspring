package com.baeldung.taskmanagementapplesson;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.service.IProjectService;

@SpringBootApplication
public class LsApplication {
	
	@Autowired
    private IProjectService projectService;
    
    @PostConstruct
    public void postConstruct() {
        Project project = new Project("My First Project", LocalDate.now());
        projectService.save(project);
    }

	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}

}
