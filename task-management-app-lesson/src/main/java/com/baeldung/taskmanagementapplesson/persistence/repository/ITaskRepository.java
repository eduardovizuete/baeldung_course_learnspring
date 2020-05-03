package com.baeldung.taskmanagementapplesson.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.baeldung.taskmanagementapplesson.persistence.model.Task;

public interface ITaskRepository extends CrudRepository<Task, Long> {
	
	@Query("select t from Task t where t.name like %?1%")
	List<Task> findByNameMatches(String name);
	
}
