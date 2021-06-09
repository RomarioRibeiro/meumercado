package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Produto;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.ProdutoRepository;
@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repo;
	
	public Produto find(Integer id)  {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException(
				"Objeto não encontrado! Id: " + id ));
	}
	
}
