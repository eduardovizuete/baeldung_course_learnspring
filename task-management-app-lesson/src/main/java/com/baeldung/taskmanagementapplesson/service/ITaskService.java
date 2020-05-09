package com.baeldung.taskmanagementapplesson.service;

import com.baeldung.taskmanagementapplesson.exception.TaskNotSavedException;
import com.baeldung.taskmanagementapplesson.persistence.model.Task;

public interface ITaskService {
	
	Iterable<Task> findAll();

    Task save(Task task) throws TaskNotSavedException;

}
