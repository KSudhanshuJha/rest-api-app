package com.book.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.book.repository.BookRepository;

@SpringBootApplication(scanBasePackages = "com.book.*")
@EnableJpaRepositories(basePackageClasses = BookRepository.class)
@EntityScan("com.book.entity")
public class BookCurdOperationH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCurdOperationH2DatabaseApplication.class, args);
	}

}
