package com.baeldung.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baeldung.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class PersistenceConfig {
	
	@Bean
	public ProjectRepositoryImpl projectRepository() {
		return new ProjectRepositoryImpl();
	}

}
