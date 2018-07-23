package com.alex.portalcandidado.dto;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.alex.portalcandidado.dto.validation.CustomerDateAndTimeDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CandidatoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer codigo;
	
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
	
	public CandidatoDTO() {

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
	
	
}
