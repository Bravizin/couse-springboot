package br.com.techne.couse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.techne.couse.entities.User;
import br.com.techne.couse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Leonardo", "l@h.co", "947008542", "123456");
		User u2 = new User(null, "Rodrigues", "r@h.co", "947068542", "122456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
