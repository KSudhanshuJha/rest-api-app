package com.employee.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.employee.repository.EmployeeRepository;

@SpringBootApplication(scanBasePackages = {"com.employee.*"})
@EnableJpaRepositories(basePackageClasses = {EmployeeRepository.class})
@EntityScan("com.employee.entity")
public class EmployeeCurdOperationH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCurdOperationH2DatabaseApplication.class, args);
	}

}
