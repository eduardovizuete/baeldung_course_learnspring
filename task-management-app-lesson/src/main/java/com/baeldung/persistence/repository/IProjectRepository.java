package com.baeldung.persistence.repository;

import java.util.Optional;

import com.baeldung.persistence.model.Project;

public interface IProjectRepository {
	
	Optional<Project> findById(Long id);
	
	Project save(Project project);

}
