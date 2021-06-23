package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	@Query(value = "select*from pedido where id = ?",nativeQuery = true)
	Pedido findPorld(Integer id);
}
