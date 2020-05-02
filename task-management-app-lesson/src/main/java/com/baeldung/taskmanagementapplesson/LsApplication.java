package com.baeldung.taskmanagementapplesson;

import java.time.LocalDate;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.service.IProjectService;

@SpringBootApplication
public class LsApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(LsApplication.class);

	@Value("${additional.info}")
	private String additional;
	
	@Autowired
    private IProjectService projectService;

	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}
	
	@PostConstruct
    public void postConstruct() {
		LOG.info("Additional Property {}", additional);
		
        Project project = new Project("My First Project", LocalDate.now());
        projectService.save(project);

        Optional<Project> optionalProject = projectService.findById(1L);
        optionalProject.ifPresent(System.out::println);
    }

}
