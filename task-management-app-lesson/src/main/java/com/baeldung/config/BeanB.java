package com.baeldung.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanB {
	
	private static final Logger log = LoggerFactory.getLogger(BeanB.class);

	public void initialize() {
		log.info("BeanB custom initializer method is called");
	}

}
