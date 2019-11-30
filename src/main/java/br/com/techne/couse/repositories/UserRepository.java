package br.com.techne.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techne.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
