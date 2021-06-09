package com.meuMercado.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Embeddable
public class PedidoItensPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="pedido_id")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public PedidoItensPK(Pedido pedido, Produto produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}
	public PedidoItensPK() {
		
	}
	
	

}
