package com.alex.portalcandidado.dto;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.alex.portalcandidado.domain.Candidato;
import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	private Date data_nascimento;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String idade;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String naturalidade;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String estado_civil;

	public CandidatoDTO() {

	}

	public CandidatoDTO(Candidato obj) {
		codigo = obj.getCodigo();
		nome = obj.getNome();
		email = obj.getEmail();
		raca = obj.getRaca();
		data_nascimento = obj.getData_nascimento();
		idade = obj.getIdade();
		naturalidade = obj.getNaturalidade();
		estado_civil = obj.getEstado_civil().getDescricao();
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

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
}
