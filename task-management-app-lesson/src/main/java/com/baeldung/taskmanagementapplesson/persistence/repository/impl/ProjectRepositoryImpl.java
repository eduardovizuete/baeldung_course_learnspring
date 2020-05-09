package com.baeldung.taskmanagementapplesson.persistence.repository.impl;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.repository.IProjectRepository;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

	@PersistenceContext
    private EntityManager em;
	
	@Transactional
	@Override
	public Optional<Project> findById(Long id) {
		Project project = em.find(Project.class, id);
		return Optional.ofNullable(project);
	}

	@Transactional
	@Override
	public Project save(Project project) {
		em.persist(project);
		return project;
	}

}
