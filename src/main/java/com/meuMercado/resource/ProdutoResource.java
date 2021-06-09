package com.meuMercado.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meuMercado.domain.Produto;
import com.meuMercado.service.ProdutoService;

@RestController
@RequestMapping(value = "/categorias")
public class ProdutoResource {
	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value="{/id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Produto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
				
	}
	
}
