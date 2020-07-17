package com.baeldung.taskmanagementapplesson.service;

import java.util.List;
import java.util.Optional;

import com.baeldung.taskmanagementapplesson.exception.TaskNotSavedException;
import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.model.Task;

public interface IProjectService {
	
	Iterable<Project> findAll();
	
	Optional<Project> findById(Long id);
	
	Project save(Project project);
	
	void createProjectWithTasks() throws TaskNotSavedException;
	
	Project addTasks(Project project, List<Task> tasks);
	
	void delete(Long id);

}
