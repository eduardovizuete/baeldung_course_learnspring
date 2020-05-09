package com.baeldung.taskmanagementapplesson.service.impl;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.baeldung.taskmanagementapplesson.exception.TaskNotSavedException;
import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.model.Task;
import com.baeldung.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.baeldung.taskmanagementapplesson.service.IProjectService;
import com.baeldung.taskmanagementapplesson.service.ITaskService;

@Service
public class ProjectServiceImpl implements IProjectService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceImpl.class);
	
	private IProjectRepository projectRepository;
	
	private ITaskService taskService;

	public ProjectServiceImpl(IProjectRepository projectRepository, ITaskService taskService) {
		this.projectRepository = projectRepository;
		this.taskService = taskService;
	}
	
	@Override
    public Iterable<Project> findAll() {
		LOG.info("Project Service >> Finding All Projects");
        return projectRepository.findAll();
    }

	@Override
	public Optional<Project> findById(Long id) {
		LOG.info("Project Service >> Finding Project By Id {}", id);
		return projectRepository.findById(id);
	}

	@Override
	public Project save(Project project) {
		LOG.info("Project Service >> Saving Project {}", project);
		return projectRepository.save(project);
	}
	
	@Transactional(rollbackOn = TaskNotSavedException.class)
	@Override
	public void createProjectWithTasks() throws TaskNotSavedException {
		LOG.info("Project Service >> Saving Project with Task");
		
	    Project project = new Project("Project 1", LocalDate.now());

	    Project newProject = save(project);

	    Task task1 = new Task("Task 1", "Project 1 Task 1", LocalDate.now(), LocalDate.now()
	        .plusDays(7));

	    taskService.save(task1);

	    Set<Task> tasks = new HashSet<>();
	    tasks.add(task1);

	    newProject.setTasks(tasks);

	    save(newProject);
	}

}
