package com.baeldung.taskmanagementapplesson.service;

import java.util.Optional;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

public interface IProjectService {
	
	Optional<Project> findById(Long id);
	
	Project save(Project project);

}
