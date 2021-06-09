package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuMercado.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
