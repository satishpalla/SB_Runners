package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerDemo implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
System.out.println("Application Runner run() method");		
	}

}
