package com.baeldung.taskmanagementapplesson.service.impl;

import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.baeldung.taskmanagementapplesson.service.IProjectService;

@Service
@Primary
public class ProjectServiceImpl implements IProjectService {
	
	private IProjectRepository projectRepository;

	public ProjectServiceImpl(IProjectRepository projectRepository) {
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
