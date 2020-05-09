package com.baeldung.taskmanagementapplesson.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.baeldung.taskmanagementapplesson.persistence.model.Task;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}