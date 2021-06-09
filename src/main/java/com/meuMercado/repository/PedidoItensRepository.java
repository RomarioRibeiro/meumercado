package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuMercado.domain.PedidoItens;

public interface PedidoItensRepository extends JpaRepository<PedidoItens, Integer> {

}
