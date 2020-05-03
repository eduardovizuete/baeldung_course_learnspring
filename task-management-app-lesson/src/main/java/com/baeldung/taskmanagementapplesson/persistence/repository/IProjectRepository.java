package com.baeldung.taskmanagementapplesson.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

public interface IProjectRepository extends CrudRepository<Project, Long>{
	
}
