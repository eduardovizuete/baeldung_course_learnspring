package com.baeldung.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.persistence.model.Project;
import com.baeldung.persistence.repository.IProjectRepository;
import com.baeldung.service.IProjectService;

@Service
public class ProjectServiceImplAutoWiring implements IProjectService {
	
	@Autowired
	private IProjectRepository projectRepository;

	public ProjectServiceImplAutoWiring(IProjectRepository projectRepository) {
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
