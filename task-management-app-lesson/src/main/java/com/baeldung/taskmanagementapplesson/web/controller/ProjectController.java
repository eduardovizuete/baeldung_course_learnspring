package com.baeldung.taskmanagementapplesson.web.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {
	
	public ProjectController() {
        super();
    }

    @GetMapping(path = "/1")
    public Project findOne() {
        return new Project("testName", LocalDate.now());
    }
	
}
