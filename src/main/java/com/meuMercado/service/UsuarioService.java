package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.Dto.UsuarioDTO;
import com.meuMercado.domain.Usuario;
import com.meuMercado.repository.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario find(Integer id) {
		Usuario obj = repo.findPorld(id);
		return obj;
	}
	public Usuario insert (Usuario obj) {
		return repo.save(obj);
	}
	public Usuario update (Usuario obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Usuario fromDTO (UsuarioDTO objDto) {
		return new Usuario(objDto.getId(),objDto.getNome(), null, null, null, null, null, null, null, null, null);
	}
}
