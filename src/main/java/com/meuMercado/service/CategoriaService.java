package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Categoria;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.CategoriaRepository;
@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id)  {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
	
	public Categoria Insert (Categoria obj) {
		return repo.save(obj);
	}
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	
}
