package com.alex.portalcandidado.dto;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import com.alex.portalcandidado.dto.validation.CustomerDateAndTimeDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CandidatoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 150, message = "Deve conter entre 5 e 150 caracteres")
	private String nome;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "E-mail inválido")
	private String email;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String raca;
	
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date data_nascimento;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String idade;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String naturalidade;
	
	private Integer estado_civil;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String Telefone1;	
	private String Telefone2;
	private String Telefone3;
	private String Telefone4;
	
	//-----------------------------------------------
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 150, message = "Deve conter entre 5 e 150 caracteres")
	private String logradouro;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String numero;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String bairro;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String cep;
	private String complemento;
	private Integer candidatoCod;
	private Integer cidadeCod;
	
	//-----------------------------------------------
	@NotEmpty(message = "Preenchimento obrigatório")
	private String rg;	
	
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date data_emissao_rg;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String orgao_emissor_rg;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String titulo_eleitor;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String zona;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String secao;	
	private Integer pis_pasep;
	private String numero_pis;
	@NotEmpty(message = "Preenchimento obrigatório")
	@CPF(message="CPF Inválido")
	private String cpf;
	private String numero_reservista;
	private String categoria;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String carteira_trab;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String serie;
	
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date data_emissao_ct;
	private Integer estado_emissor_cod;
	
	
	//-----------------------------------------------
	
	public CandidatoDTO() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public Integer getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(Integer estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getTelefone1() {
		return Telefone1;
	}

	public void setTelefone1(String telefone1) {
		Telefone1 = telefone1;
	}

	public String getTelefone2() {
		return Telefone2;
	}

	public void setTelefone2(String telefone2) {
		Telefone2 = telefone2;
	}

	public String getTelefone3() {
		return Telefone3;
	}

	public void setTelefone3(String telefone3) {
		Telefone3 = telefone3;
	}

	public String getTelefone4() {
		return Telefone4;
	}

	public void setTelefone4(String telefone4) {
		Telefone4 = telefone4;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getData_emissao_rg() {
		return data_emissao_rg;
	}

	public void setData_emissao_rg(Date data_emissao_rg) {
		this.data_emissao_rg = data_emissao_rg;
	}

	public String getOrgao_emissor_rg() {
		return orgao_emissor_rg;
	}

	public void setOrgao_emissor_rg(String orgao_emissor_rg) {
		this.orgao_emissor_rg = orgao_emissor_rg;
	}

	public String getTitulo_eleitor() {
		return titulo_eleitor;
	}

	public void setTitulo_eleitor(String titulo_eleitor) {
		this.titulo_eleitor = titulo_eleitor;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public Integer getPis_pasep() {
		return pis_pasep;
	}

	public void setPis_pasep(Integer pis_pasep) {
		this.pis_pasep = pis_pasep;
	}

	public String getNumero_pis() {
		return numero_pis;
	}

	public void setNumero_pis(String numero_pis) {
		this.numero_pis = numero_pis;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumero_reservista() {
		return numero_reservista;
	}

	public void setNumero_reservista(String numero_reservista) {
		this.numero_reservista = numero_reservista;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCarteira_trab() {
		return carteira_trab;
	}

	public void setCarteira_trab(String carteira_trab) {
		this.carteira_trab = carteira_trab;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Date getData_emissao_ct() {
		return data_emissao_ct;
	}

	public void setData_emissao_ct(Date data_emissao_ct) {
		this.data_emissao_ct = data_emissao_ct;
	}

	public Integer getEstado_emissor_cod() {
		return estado_emissor_cod;
	}

	public void setEstado_emissor_cod(Integer estado_emissor_cod) {
		this.estado_emissor_cod = estado_emissor_cod;
	}
	
	
	
	
}
