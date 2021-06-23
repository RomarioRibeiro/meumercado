package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Endereco;
import com.meuMercado.repository.EnderecoRepository;
@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco find(Integer id)  {
		Endereco obj = repo.findPorld(id);
		return obj;
	}
	public Endereco insert(Endereco obj) {
		return repo.save(obj);
	}
	public Endereco update (Endereco obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
