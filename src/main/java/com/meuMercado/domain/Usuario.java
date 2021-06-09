package com.meuMercado.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpfOuCnpj;
	private String telefone;
	private String whats;
	private String email;
	private Date dataNascimento;
	private String sexo;
	private String senha;
	private String clubMercado;
	@ManyToOne
	private Mercado mercado;
	
	public Mercado getMercado() {
		return mercado;
	}


	public void setMercado(Mercado mercado) {
		this.mercado = mercado;
	}


	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
	public Usuario() { 
	}


	public Usuario(Integer id, String nome, String cpfOuCnpj, String telefone, String whats, String email,
			Date dataNascimento, String sexo, String senha, String clubMercado, Mercado mercado) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpfOuCnpj = cpfOuCnpj;
		this.telefone = telefone;
		this.whats = whats;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.senha = senha;
		this.clubMercado = clubMercado;
		this.mercado = mercado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}


	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getWhats() {
		return whats;
	}


	public void setWhats(String whats) {
		this.whats = whats;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getClubMercado() {
		return clubMercado;
	}


	public void setClubMercado(String clubMercado) {
		this.clubMercado = clubMercado;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
