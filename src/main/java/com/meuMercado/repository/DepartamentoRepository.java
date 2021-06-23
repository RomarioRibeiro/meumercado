package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento , Integer> {

	@Query(value= "select*from Departamento where id =?",nativeQuery = true)
	
	Departamento findPorld(Integer id);
}
