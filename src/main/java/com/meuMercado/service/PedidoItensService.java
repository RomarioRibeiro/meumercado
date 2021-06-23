package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.PedidoItens;
import com.meuMercado.repository.PedidoItensRepository;
@Service
public class PedidoItensService {
	@Autowired
	private PedidoItensRepository repo;
	
	public PedidoItens find(Integer id)  {
		PedidoItens obj = repo.findPorld(id);
		return obj;
	}
	public PedidoItens insert(PedidoItens obj) {
		return repo.save(obj);
	}
	public PedidoItens update (PedidoItens obj) {
		return repo.save(obj);
	}
}
