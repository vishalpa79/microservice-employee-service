package com.evoke.researchlabs.row;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author apandiri
 * @description RestServiceApplication class is a starting point for triggering spring boot application
 * @version 1.0
 */
@SpringBootApplication

@EnableMongoRepositories("com.evoke.researchlabs.row.employee.repo")
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		logger.debug("main method started");
		SpringApplication.run(Application.class, args);
		logger.debug("main method ended");
	}
}
