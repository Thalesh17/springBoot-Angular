package com.thaleshenrique.mapfre;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thaleshenrique.mapfre.domain.User;
import com.thaleshenrique.mapfre.repositories.UserRepository;

@SpringBootApplication
public class MapfreApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MapfreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User(null, "Thales", "thaales@gmail.com", "123flu123");
		User user2 = new User(null, "Daniel", "daniel@gmail.com", "1233445");
		
		userRepository.saveAll(Arrays.asList(user, user2));
	}

}
