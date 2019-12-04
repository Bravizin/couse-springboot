package br.com.techne.couse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.techne.couse.entities.Order;
import br.com.techne.couse.entities.User;
import br.com.techne.couse.repositories.OrderRepository;
import br.com.techne.couse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Leonardo", "l@h.co", "947008542", "123456");
		User u2 = new User(null, "Rodrigues", "r@h.co", "947068542", "122456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:12Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-21T05:32:32Z"), u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
	
}
