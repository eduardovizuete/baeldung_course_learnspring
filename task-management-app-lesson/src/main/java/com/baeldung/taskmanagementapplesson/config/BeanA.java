package com.baeldung.taskmanagementapplesson.config;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanA {
	
	private static final Logger log = LoggerFactory.getLogger(BeanC.class);
	
	@PostConstruct
	public void post() {
		log.info("BeanA @PostConstruct annotated method is called");
	}

}
