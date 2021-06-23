package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Departamento;
import com.meuMercado.repository.DepartamentoRepository;
@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository repo;
	
	public Departamento find(Integer id)  {
		Departamento obj = repo.findPorld(id);
		return obj;
	}
	
	public Departamento Insert (Departamento obj) {
		return repo.save(obj);
	}
	public Departamento update(Departamento obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
}

