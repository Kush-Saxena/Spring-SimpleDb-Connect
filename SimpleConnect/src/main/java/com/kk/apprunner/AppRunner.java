package com.kk.apprunner;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kk.dto.SampleObject;
import com.kk.service.IDatabaseService;

public class AppRunner {

	public static void main(String[] args) {

		// Creating a Spring application context using the ApplicationContext Interface

		ApplicationContext appContext = new AnnotationConfigApplicationContext(com.kk.config.AppContext.class);

		IDatabaseService dbService = appContext.getBean("serviceBean", com.kk.service.IDatabaseService.class);

		// Fill the table name here
		String tableName = "studentData";

		// Getting data using fetchData method
		List<SampleObject> resultData = dbService.fetchData(tableName);

		// using a for-Each loop to print each object in the result set
		System.out.println("===Printing Data===");
		for (SampleObject s : resultData) {
			System.out.println(s);
		}

		// Closing requires explicit type-casting because close method is only present
		// in AnnotationConfigApplicationContext Class.
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
