package com.baeldung.taskmanagementapplesson.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.baeldung.taskmanagementapplesson.service.IProjectService;

public class ProjectServiceImpSetterInjection implements IProjectService {
	
	private IProjectRepository projectRepository;
	
	@Autowired
	public void setProjectRepository(IProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	@Override
	public Optional<Project> findById(Long id) {
		return projectRepository.findById(id);
	}

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

}
