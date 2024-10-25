package org.sid.customerservice;

import org.sid.customerservice.Dao.entities.Customer;
import org.sid.customerservice.Dao.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("Fahd").email("fahd@gmail.com").build());
			customerRepository.save(Customer.builder().name("Mohamed").email("mohamed@gmail.com").build());
		};
	}

}
