package com.baeldung.taskmanagementapplesson.persistence.repository;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.taskmanagementapplesson.persistence.model.Project;

@SpringBootTest
public class ProjectRepositoryIntegrationTest {
	
	@Autowired
	private IProjectRepository projectRepository;
	
	@Test
	public void whenSavingNewProject_thenSuccess() {
		Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
		
		assertNotNull(projectRepository.save(newProject));
	}
	
	@Test
	public void givenProject_whenFindById_thenSuccess() {
		Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
		projectRepository.save(newProject);
		
		Optional<Project> retrievedProject = projectRepository.findById(newProject.getId());
		
		assertEquals(retrievedProject.get(), newProject);
	}

}