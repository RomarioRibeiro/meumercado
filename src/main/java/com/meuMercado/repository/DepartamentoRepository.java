package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuMercado.domain.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento , Integer> {

}
