package com.portfolio.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class PortfolioBackendApplication {
	private static final Logger logger = LoggerFactory.getLogger(PortfolioBackendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
		logger.info("Spring Boot sovellus on käynnissä!");
	}

}
