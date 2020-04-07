package com.baeldung.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.baeldung.persistence.model.Project;
import com.baeldung.persistence.repository.IProjectRepository;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {
	
	List<Project> projects = new ArrayList<>();

	@Override
	public Optional<Project> findById(Long id) {
		return projects.stream().filter(p -> p.getId() == id).findFirst();
	}

	@Override
	public Project save(Project project) {
		Project existingProject = findById(project.getId()).orElse(null);
		if (existingProject == null) {
			projects.add(existingProject);
		} else {
			projects.remove(existingProject);
			Project newProject = new Project(project);
			projects.add(newProject);
		}
		return project;
	}	

}
