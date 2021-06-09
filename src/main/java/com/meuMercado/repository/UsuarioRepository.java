package com.meuMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuMercado.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
