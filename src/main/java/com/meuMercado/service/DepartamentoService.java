package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Departamento;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.DepartamentoRepository;
@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository repo;
	
	public Departamento find(Integer id)  {
		Optional<Departamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException(
				"Objeto não encontrado! Id: " + id ));
	}
	
	public Departamento Insert (Departamento obj) {
		return repo.save(obj);
	}
	public Departamento update(Departamento obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
}

