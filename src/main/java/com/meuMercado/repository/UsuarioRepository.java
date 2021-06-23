package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuMercado.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(value= "select*from usuario where id = ?",nativeQuery = true)
	Usuario findPorld (Integer id);
}
