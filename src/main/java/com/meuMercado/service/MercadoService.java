package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Mercado;
import com.meuMercado.repository.MercadoRepository;
@Service
public class MercadoService {
	@Autowired
	private MercadoRepository repo;
	
	public Mercado find(Integer id) {
		
		Mercado obj = repo.findPorld(id);
		
		return obj;
	}
	public Mercado insert(Mercado obj) {
		return repo.save(obj);
	}
	
	public Mercado update (Mercado obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
