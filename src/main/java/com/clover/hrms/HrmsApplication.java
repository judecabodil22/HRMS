package com.clover.hrms;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@SpringBootApplication
@EnableJpaAuditing
@EnableAsync

public class HrmsApplication {
	
	
	 @Bean(name = "threadPoolTaskExecutor")
	    public Executor threadPoolTaskExecutor() {
	        return new ThreadPoolTaskExecutor();
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}
}
