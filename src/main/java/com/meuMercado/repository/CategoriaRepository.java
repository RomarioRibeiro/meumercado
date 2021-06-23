package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	@Query(value = "select*from categoria where id = ?",nativeQuery = true)
	
	Categoria findPorld(Integer id);
}
