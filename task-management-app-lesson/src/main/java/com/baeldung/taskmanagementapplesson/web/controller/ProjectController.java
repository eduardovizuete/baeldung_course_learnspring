package com.baeldung.taskmanagementapplesson.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;
import com.baeldung.taskmanagementapplesson.persistence.model.Task;
import com.baeldung.taskmanagementapplesson.service.IProjectService;
import com.baeldung.taskmanagementapplesson.web.dto.ProjectDto;
import com.baeldung.taskmanagementapplesson.web.dto.TaskDto;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {
	
	private IProjectService projectService;

    public ProjectController(IProjectService projectService) {
        this.projectService = projectService;
    }
	
	@GetMapping(value = "/{id}")
    public ProjectDto findOne(@PathVariable Long id) {
        Project entity = projectService.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(entity);
    }
	
	@PostMapping
    public void create(@RequestBody ProjectDto newProject) {
        this.projectService.save(convertToEntity(newProject));
    }
	
	private ProjectDto convertToDto(Project entity) {
		return new ProjectDto(entity.getId(), entity.getName());
	}
	
	private Project convertToEntity(ProjectDto dto) {
		Project project = new Project(dto.getName(), null);
		if (StringUtils.isEmpty(dto.getId())) {
			project.setId(dto.getId());
		}
		
		return project;
	}
	
	private TaskDto convertTaskToDto(Task entity) {
	    TaskDto dto = new TaskDto(entity.getId(), entity.getName(), entity.getDescription(), entity.getDateCreated(), entity.getDueDate(), entity.getStatus());
	    return dto;
	}

	private Task convertTaskToEntity(TaskDto dto) {
	    Task task = new Task(dto.getName(), dto.getDescription(), dto.getDateCreated(), dto.getDueDate(), dto.getStatus());
	    if (!StringUtils.isEmpty(dto.getId())) {
	        task.setId(dto.getId());
	    }
	    return task;
	}
	
}
