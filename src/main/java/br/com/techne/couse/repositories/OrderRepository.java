package br.com.techne.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techne.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
