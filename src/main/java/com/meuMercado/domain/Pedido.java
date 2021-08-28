package com.meuMercado.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Pedido  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal precoTotalEstimado;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(columnDefinition = "date")    
    private LocalDate dataEntrega;	
	private String horaEntrega;

	private double trocoPara;
	private String status;

	@ManyToOne
	private Usuario usuario;
	@OneToOne
	private Mercado mercado;
	
	private String tipoPagamento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecoTotalEstimado() {
		return precoTotalEstimado;
	}

	public void setPrecoTotalEstimado(BigDecimal precoTotalEstimado) {
		this.precoTotalEstimado = precoTotalEstimado;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	public double getTrocoPara() {
		return trocoPara;
	}

	public void setTrocoPara(double trocoPara) {
		this.trocoPara = trocoPara;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Mercado getMercado() {
		return mercado;
	}

	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", precoTotalEstimado=" + precoTotalEstimado + ", dataEntrega=" + dataEntrega
				+ ", horaEntrega=" + horaEntrega + ", trocoPara=" + trocoPara + ", status=" + status + ", usuario="
				+ usuario + ", mercado=" + mercado + ", tipoPagamento=" + tipoPagamento + "]";
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Pedido(Integer id, BigDecimal precoTotalEstimado, LocalDate dataEntrega, String horaEntrega,
			double trocoPara, String status, Usuario usuario, Mercado mercado, String tipoPagamento) {
		super();
		this.id = id;
		this.precoTotalEstimado = precoTotalEstimado;
		this.dataEntrega = dataEntrega;
		this.horaEntrega = horaEntrega;
		this.trocoPara = trocoPara;
		this.status = status;
		this.usuario = usuario;
		this.mercado = mercado;
		this.tipoPagamento = tipoPagamento;
	}
	
	public Pedido() {
		
	}
	
	
}
