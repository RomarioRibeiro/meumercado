package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Produto;
import com.meuMercado.repository.ProdutoRepository;
@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repo;
	
	public Produto find(Integer id)  {
		Produto obj = repo.findPorld(id);
		return obj;
	}
	public Produto insert (Produto obj) {
		return repo.save(obj);
	}
	public Produto update(Produto obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
