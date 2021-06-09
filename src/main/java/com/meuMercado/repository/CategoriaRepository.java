package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuMercado.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
