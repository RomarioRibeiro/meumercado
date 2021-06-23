package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	@Query(value ="select*from endereco where  id = ?",nativeQuery = true)
	Endereco findPorld(Integer id);
}
