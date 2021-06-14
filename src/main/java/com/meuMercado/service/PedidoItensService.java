package com.meuMercado.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuMercado.domain.PedidoItens;
import com.meuMercado.exception.ObjetoException;
import com.meuMercado.repository.PedidoItensRepository;
@Service
public class PedidoItensService {
	@Autowired
	private PedidoItensRepository repo;
	
	public PedidoItens find(Integer id)  {
		Optional<PedidoItens> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjetoException(
				"Objeto não encontrado! Id: " + id ));
	}
	public PedidoItens insert(PedidoItens obj) {
		return repo.save(obj);
	}
	public PedidoItens update (PedidoItens obj) {
		return repo.save(obj);
	}
}
