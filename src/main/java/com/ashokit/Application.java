package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	
	private Map<String,Object> cache= new HashMap<String,Object>();
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext run = SpringApplication.run(Application.class);
		
		int a=20;		

		//Changes for HIS-134 
		run.close();		
	    
	}
	
	//HIS 301 changes
	public void loadDataToCache (){

	//logic
	}

}
