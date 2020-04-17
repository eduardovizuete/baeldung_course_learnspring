package com.baeldung.taskmanagementapplesson.persistence.repository;

import java.util.Optional;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

public interface IProjectRepository {
	
	Optional<Project> findById(Long id);
	
	Project save(Project project);

}
