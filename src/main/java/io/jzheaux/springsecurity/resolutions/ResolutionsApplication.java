package io.jzheaux.springsecurity.resolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class ResolutionsApplication {

	@Bean
	public UserDetailsService userDetailsService() {
		return new InMemoryUserDetailsManager(
				org.springframework.security.core.userdetails.User
						.withUsername("user")
						.password("$2a$10$5fxXhsdny..sm64p8AB0tOMkAWr9.eG36IbKgH.JfgfN.Uy8OQbgu")
						.authorities("resolution:read")
						.build());
	}

	public static void main(String[] args) {
		SpringApplication.run(ResolutionsApplication.class, args);
	}



}
