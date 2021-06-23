package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.PedidoItens;

public interface PedidoItensRepository extends JpaRepository<PedidoItens, Integer> {

	@Query(value= "select*from pedidoitens where id =?",nativeQuery = true)
	PedidoItens findPorld(Integer id);
	
}
