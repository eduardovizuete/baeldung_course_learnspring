package com.baeldung.taskmanagementapplesson.service.impl;

import org.springframework.stereotype.Service;

import com.baeldung.taskmanagementapplesson.exception.TaskNotSavedException;
import com.baeldung.taskmanagementapplesson.persistence.model.Task;
import com.baeldung.taskmanagementapplesson.persistence.repository.ITaskRepository;
import com.baeldung.taskmanagementapplesson.service.ITaskService;

@Service
public class TaskServiceImpl implements ITaskService {

    private ITaskRepository taskRepository;

    public TaskServiceImpl(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) throws TaskNotSavedException {
        return taskRepository.save(task);
    }

}