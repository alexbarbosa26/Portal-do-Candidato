package com.alex.portalcandidado.dto;

import java.io.Serializable;

public class EnderecoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String complemento;
	private Integer candidatoCod;
	private Integer cidadeCod;
	
	public EnderecoDTO() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Integer getCandidatoCod() {
		return candidatoCod;
	}

	public void setCandidatoCod(Integer candidatoCod) {
		this.candidatoCod = candidatoCod;
	}

	public Integer getCidadeCod() {
		return cidadeCod;
	}

	public void setCidadeCod(Integer cidadeCod) {
		this.cidadeCod = cidadeCod;
	}
	
	

}
