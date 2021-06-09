package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuMercado.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
