package com.mycompany.databaseservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {
		"com.mycompany.databaseservice.config",
        "com.mycompany.databaseservice.service"})
@EnableJpaRepositories(basePackages = {"com.mycompany.databaseservice.repository"})
@EnableScheduling
@EnableEurekaClient
@EntityScan(basePackages = {"com.mycompany.common.entity"})
//@EnableHystrix
//@EnableHystrixDashboard
public class DataBaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseServiceApplication.class, args);
	}

}
