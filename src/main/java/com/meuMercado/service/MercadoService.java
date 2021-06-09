package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Mercado;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.MercadoRepository;
@Service
public class MercadoService {
	@Autowired
	private MercadoRepository repo;
	
	public Mercado find(Integer id) {
		
		Optional<Mercado> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjetoException("Objeto não encontrado! Id:" + id));
	}
	
}
