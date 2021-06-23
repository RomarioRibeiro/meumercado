package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	@Query(value = "select*from produto where id =?",nativeQuery = true)
	Produto findPorld (Integer id);
}
