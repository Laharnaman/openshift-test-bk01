package com.example.bootiful;

import com.example.bootiful.domain.Customer;
import com.example.bootiful.domain.CustomerRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class BootifulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootifulApplication.class, args);
	}


	@Bean
	ApplicationRunner run(CustomerRepository customerRepository) {
		System.out.println(">>>>>>>>>>>>>>>>  Invoking spring runner");
		return args -> Stream.of("Bob", "Erinn", "Emma", "Robin")
				//.map(x -> x.toUpperCase())
				.forEach(x -> customerRepository.save(new Customer(null, x))	);
	}


}

