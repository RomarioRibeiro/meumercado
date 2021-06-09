package com.meuMercado.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Integer unidadeMedida;
	private BigDecimal preco;
	private BigDecimal precoClub;
	private BigDecimal promocao;
	private BigDecimal percentualDesconto;
	private Blob imagem;
	
	@ManyToOne
	private Mercado mercado;
	
	@ManyToOne
	private Categoria categoria;
	
	
	
	public Produto(Integer id, String descricao, Integer unidadeMedida, BigDecimal preco, BigDecimal precoClub,
			BigDecimal promocao, BigDecimal percentualDesconto, Blob imagem, Mercado mercado, Categoria categoria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.preco = preco;
		this.precoClub = precoClub;
		this.promocao = promocao;
		this.percentualDesconto = percentualDesconto;
		this.imagem = imagem;
		this.mercado = mercado;
		this.categoria = categoria;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getUnidadeMedida() {
		return unidadeMedida;
	}


	public void setUnidadeMedida(Integer unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public BigDecimal getPrecoClub() {
		return precoClub;
	}


	public void setPrecoClub(BigDecimal precoClub) {
		this.precoClub = precoClub;
	}


	public BigDecimal getPromocao() {
		return promocao;
	}


	public void setPromocao(BigDecimal promocao) {
		this.promocao = promocao;
	}


	public BigDecimal getPercentualDesconto() {
		return percentualDesconto;
	}


	public void setPercentualDesconto(BigDecimal percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}


	public Blob getImagem() {
		return imagem;
	}


	public void setImagem(Blob imagem) {
		this.imagem = imagem;
	}


	public Mercado getMercado() {
		return mercado;
	}


	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Produto() {
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
