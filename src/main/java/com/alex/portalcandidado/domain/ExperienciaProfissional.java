package com.alex.portalcandidado.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ExperienciaProfissional implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String empresa_atual_ultima;
	private String endereco;
	private String telefone;
	private String ultimo_cargo;
	private String periodo_trab;
	private Double ultimo_Salario;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="candidato_cod")
	private Candidato candidato;
	
	public ExperienciaProfissional() {
		
	}

	public ExperienciaProfissional(Integer codigo, String empresa_atual_ultima, String endereco, String telefone,
			String ultimo_cargo, String periodo_trab, Double ultimo_Salario, Candidato candidato) {
		super();
		this.codigo = codigo;
		this.empresa_atual_ultima = empresa_atual_ultima;
		this.endereco = endereco;
		this.telefone = telefone;
		this.ultimo_cargo = ultimo_cargo;
		this.periodo_trab = periodo_trab;
		this.ultimo_Salario = ultimo_Salario;
		this.candidato=candidato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEmpresa_atual_ultima() {
		return empresa_atual_ultima;
	}

	public void setEmpresa_atual_ultima(String empresa_atual_ultima) {
		this.empresa_atual_ultima = empresa_atual_ultima;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUltimo_cargo() {
		return ultimo_cargo;
	}

	public void setUltimo_cargo(String ultimo_cargo) {
		this.ultimo_cargo = ultimo_cargo;
	}

	public String getPeriodo_trab() {
		return periodo_trab;
	}

	public void setPeriodo_trab(String periodo_trab) {
		this.periodo_trab = periodo_trab;
	}

	public Double getUltimo_Salario() {
		return ultimo_Salario;
	}

	public void setUltimo_Salario(Double ultimo_Salario) {
		this.ultimo_Salario = ultimo_Salario;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		ExperienciaProfissional other = (ExperienciaProfissional) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
