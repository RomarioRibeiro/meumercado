package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.Pedido;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.PedidoRepository;
@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id)  {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException(
				"Objeto não encontrado! Id: " + id ));
	}
	public Pedido insert(Pedido obj) {
		return repo.save(obj);
	}
	public Pedido update (Pedido obj) {
		find(obj.getId());
		return repo.save(obj);
	}
}
