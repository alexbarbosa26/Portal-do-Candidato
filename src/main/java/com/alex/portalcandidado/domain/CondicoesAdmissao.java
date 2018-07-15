package com.alex.portalcandidado.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.alex.portalcandidado.enums.TipoSimNao;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CondicoesAdmissao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String cargo_pretendido;
	private Double pretensao_salarial;
	private Integer periodo_experiencia;
	private Integer pagou_cont_sindical;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="candidato_cod")
	private Candidato candidato;
	
	public CondicoesAdmissao() {
		
	}

	public CondicoesAdmissao(Integer codigo, String cargo_pretendido, Double pretensao_salarial,
			TipoSimNao periodo_experiencia, TipoSimNao pagou_cont_sindical, Candidato candidato) {
		super();
		this.codigo = codigo;
		this.cargo_pretendido = cargo_pretendido;
		this.pretensao_salarial = pretensao_salarial;
		this.periodo_experiencia = periodo_experiencia.getCod();
		this.pagou_cont_sindical = pagou_cont_sindical.getCod();
		this.candidato=candidato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCargo_pretendido() {
		return cargo_pretendido;
	}

	public void setCargo_pretendido(String cargo_pretendido) {
		this.cargo_pretendido = cargo_pretendido;
	}

	public Double getPretensao_salarial() {
		return pretensao_salarial;
	}

	public void setPretensao_salarial(Double pretensao_salarial) {
		this.pretensao_salarial = pretensao_salarial;
	}

	public TipoSimNao getPeriodo_experiencia() {
		return TipoSimNao.toEnum(periodo_experiencia);
	}

	public void setPeriodo_experiencia(TipoSimNao periodo_experiencia) {
		this.periodo_experiencia = periodo_experiencia.getCod();
	}

	public TipoSimNao getPagou_cont_sindical() {
		return TipoSimNao.toEnum(pagou_cont_sindical);
	}

	public void setPagou_cont_sindical(TipoSimNao pagou_cont_sindical) {
		this.pagou_cont_sindical = pagou_cont_sindical.getCod();
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
		CondicoesAdmissao other = (CondicoesAdmissao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
