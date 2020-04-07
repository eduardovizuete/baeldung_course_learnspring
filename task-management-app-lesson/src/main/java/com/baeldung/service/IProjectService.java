package com.baeldung.service;

import java.util.Optional;

import com.baeldung.persistence.model.Project;

public interface IProjectService {
	
	Optional<Project> findById(Long id);
	
	Project save(Project project);

}
