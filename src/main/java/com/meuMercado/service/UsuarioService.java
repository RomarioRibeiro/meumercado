package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Usuario;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario find(Integer id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException("Objeto não encontrado! Id:" + id));
	}
}
