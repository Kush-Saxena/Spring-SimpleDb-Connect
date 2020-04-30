package com.kk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.kk"})
@PropertySource(value = {"classpath:dbConnection.properties"})
public class AppContext {

	//No Bean Creation is required since component scan is doing all the bean creation implicitly.
	
	
}
