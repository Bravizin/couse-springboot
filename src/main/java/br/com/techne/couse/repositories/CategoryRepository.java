package br.com.techne.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techne.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
