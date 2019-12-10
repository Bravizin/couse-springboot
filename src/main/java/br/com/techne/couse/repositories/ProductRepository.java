package br.com.techne.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techne.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
