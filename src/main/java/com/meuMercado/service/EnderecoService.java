package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Endereco;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.EnderecoRepository;
@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco find(Integer id)  {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException(
				"Objeto não encontrado! Id: " + id ));
	}
	
}
