package com.baeldung.taskmanagementapplesson.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long> {
	
	Iterable<Project> findByNameContaining(String name);
	
}