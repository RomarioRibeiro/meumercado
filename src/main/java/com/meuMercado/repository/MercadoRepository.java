package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Mercado;

public interface MercadoRepository extends JpaRepository<Mercado, Integer> {

	@Query(value="select*from mercado where id = ?",nativeQuery = true)
	Mercado findPorld(Integer id);
}
