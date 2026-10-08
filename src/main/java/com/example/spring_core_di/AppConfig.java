package com.example.spring_core_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



	@Configuration
	public class AppConfig {

	    @Bean
	    public Courses course() {
	        return new Courses();
	    }

	    @Bean
	    public Student student() {
	        return new Student(course());
	    }
	}

