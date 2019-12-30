package com.capgemini.rhamt.rules.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		//Get the required bean from application context
		ApplicationService appService = applicationContext.getBean(ApplicationService.class);
        appService.runService(); 
		
	}

}
