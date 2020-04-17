package com.baeldung.taskmanagementapplesson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baeldung.taskmanagementapplesson.service.IProjectService;
import com.baeldung.taskmanagementapplesson.service.impl.ProjectServiceImpSetterInjection;

@Configuration
public class AppConfig {
	
	@Bean
	public IProjectService projectServiceImpSetterInjection() {
		return new ProjectServiceImpSetterInjection();
	}
	
	@Bean
	public BeanA beanA() {
		return new BeanA();
	}
	
	@Bean(initMethod = "initialize")
	public BeanB beanB() {
		return new BeanB();
	}
	
	@Bean(destroyMethod = "destroy")
	public BeanC beanC() {
		return new BeanC();
	}
	
}
