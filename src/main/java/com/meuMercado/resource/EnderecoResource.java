package com.meuMercado.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meuMercado.domain.Endereco;
import com.meuMercado.service.EnderecoService;

@RestController
@RequestMapping(value = "/categorias")
public class EnderecoResource {
	@Autowired
	private EnderecoService service;
	
	@RequestMapping(value="{/id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Endereco obj = service.find(id);
		return ResponseEntity.ok().body(obj);
				
	}
	
}
