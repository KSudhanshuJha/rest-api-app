package com.customer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.customer.repository.CustomerRepository;

@SpringBootApplication(scanBasePackages = "com.customer.*")
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
@EntityScan("com.customer.entity")
public class CustomerCurdOperationH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerCurdOperationH2DatabaseApplication.class, args);
	}

}
