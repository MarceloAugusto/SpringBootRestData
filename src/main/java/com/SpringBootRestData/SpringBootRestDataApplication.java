package com.SpringBootRestData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
        "com.SpringBootRestData.entity"
        })
@EnableJpaRepositories(basePackages = {
        "com.SpringBootRestData.repository"
        })
public class SpringBootRestDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataApplication.class, args);
	}
}
