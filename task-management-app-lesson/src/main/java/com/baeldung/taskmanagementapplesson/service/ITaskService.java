package com.baeldung.taskmanagementapplesson.service;

import java.util.Optional;

import com.baeldung.taskmanagementapplesson.exception.TaskNotSavedException;
import com.baeldung.taskmanagementapplesson.persistence.model.Task;

public interface ITaskService {
	
	Optional<Task> findById(Long id);
	
	Iterable<Task> findAll();

    Task save(Task task) throws TaskNotSavedException;

}
