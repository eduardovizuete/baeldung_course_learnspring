package com.baeldung.taskmanagementapplesson.service;

import java.util.Optional;

import com.baeldung.taskmanagementapplesson.exception.TaskNotSavedException;
import com.baeldung.taskmanagementapplesson.persistence.model.Project;

public interface IProjectService {
	
	Iterable<Project> findAll();
	
	Optional<Project> findById(Long id);
	
	Project save(Project project);
	
	void createProjectWithTasks() throws TaskNotSavedException;

}
