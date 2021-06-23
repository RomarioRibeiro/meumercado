package com.meuMercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Pedido;
import com.meuMercado.repository.PedidoRepository;
@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id)  {
		Pedido obj = repo.findPorld(id);
		return obj;
	}
	public Pedido insert(Pedido obj) {
		return repo.save(obj);
	}
	public Pedido update (Pedido obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
