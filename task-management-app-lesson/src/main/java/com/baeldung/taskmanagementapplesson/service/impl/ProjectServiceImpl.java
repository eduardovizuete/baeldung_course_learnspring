package com.baeldung.taskmanagementapplesson.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.baeldung.taskmanagementapplesson.service.IProjectService;

@Service
public class ProjectServiceImpl implements IProjectService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);
	
	private IProjectRepository projectRepository;

	public ProjectServiceImpl(IProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}

	@Override
	public Optional<Project> findById(Long id) {
		LOG.info("Project Service >> Finding Project By Id {}", id);
		return projectRepository.findById(id);
	}

	@Override
	public Project save(Project project) {
		LOG.info("Project Service >> Saving Project", project);
		return projectRepository.save(project);
	}

}
