package com.invoice.invoice;

import com.invoice.invoice.entities.Role;
import com.invoice.invoice.entities.User;
import com.invoice.invoice.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;


@SpringBootApplication
@AllArgsConstructor
public class InvoiceApplication {

	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(InvoiceApplication.class, args);
	}
	BCryptPasswordEncoder passwordEncoder;

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		User user1 = new User("admin@my-invoice.fr", passwordEncoder.encode("qwerty"));
		user1.setRoleList(Arrays.asList(new Role("ADMIN")));
		userRepository.save(user1);

		return null;}

}
