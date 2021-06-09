package com.meuMercado.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class PedidoItens implements Serializable{
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	public PedidoItensPK id = new PedidoItensPK();
	public PedidoItensPK getId() {
		return id;
	}
	public void setId(PedidoItensPK id) {
		this.id = id;
	}
	private Integer quantidade;
	private BigDecimal precoUnitario;
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	@Override
	public String toString() {
		return "PedidoItens [quantidade=" + quantidade + ", precoUnitario=" + precoUnitario + "]";
	}
	
	
	
	
}
