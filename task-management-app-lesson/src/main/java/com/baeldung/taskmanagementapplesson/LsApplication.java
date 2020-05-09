package com.baeldung.taskmanagementapplesson;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.taskmanagementapplesson.service.IProjectService;
import com.baeldung.taskmanagementapplesson.service.ITaskService;

@SpringBootApplication
public class LsApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(LsApplication.class);
	
	@Autowired
    IProjectService projectService;

    @Autowired
    ITaskService taskService;
	
	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}
	
	@PostConstruct
    public void postConstruct() {
        try {
            projectService.createProjectWithTasks();
        } catch (Exception e) {
            LOG.error("Error occurred in creating project with tasks", e);
        }

        LOG.info("Fetching all Projects");
        projectService.findAll()
            .forEach(p -> LOG.info(p.toString()));

        LOG.info("Fetching all tasks");
        taskService.findAll()
            .forEach(t -> LOG.info(t.toString()));
    }
	
}
