package com.alex.portalcandidado.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class FormacaoEducacional implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String inst_ensino_medio;
	private Date conclusao_ens_med;
	private String nome_curso_tec;
	private String inst_graduacao_sup;
	private Date conclusao_previsao_sup;
	private String nome_curso_sup;
	private String inst_pos_graduacao;
	private Date conclusao_previsao_pos;
	private String nome_curso_pos;
	
	@OneToOne
	@JoinColumn(name="candidato_cod")
	private Candidato candidato;
	
	public FormacaoEducacional() {
		
	}

	public FormacaoEducacional(Integer codigo, String inst_ensino_medio, Date conclusao_ens_med, String nome_curso_tec,
			String inst_graduacao_sup, Date conclusao_previsao_sup, String nome_curso_sup, String inst_pos_graduacao,
			Date conclusao_previsao_pos, String nome_curso_pos, Candidato candidato) {
		super();
		this.codigo = codigo;
		this.inst_ensino_medio = inst_ensino_medio;
		this.conclusao_ens_med = conclusao_ens_med;
		this.nome_curso_tec = nome_curso_tec;
		this.inst_graduacao_sup = inst_graduacao_sup;
		this.conclusao_previsao_sup = conclusao_previsao_sup;
		this.nome_curso_sup = nome_curso_sup;
		this.inst_pos_graduacao = inst_pos_graduacao;
		this.conclusao_previsao_pos = conclusao_previsao_pos;
		this.nome_curso_pos = nome_curso_pos;
		this.candidato=candidato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getInst_ensino_medio() {
		return inst_ensino_medio;
	}

	public void setInst_ensino_medio(String inst_ensino_medio) {
		this.inst_ensino_medio = inst_ensino_medio;
	}

	public Date getConclusao_ens_med() {
		return conclusao_ens_med;
	}

	public void setConclusao_ens_med(Date conclusao_ens_med) {
		this.conclusao_ens_med = conclusao_ens_med;
	}

	public String getNome_curso_tec() {
		return nome_curso_tec;
	}

	public void setNome_curso_tec(String nome_curso_tec) {
		this.nome_curso_tec = nome_curso_tec;
	}

	public String getInst_graduacao_sup() {
		return inst_graduacao_sup;
	}

	public void setInst_graduacao_sup(String inst_graduacao_sup) {
		this.inst_graduacao_sup = inst_graduacao_sup;
	}

	public Date getConclusao_previsao_sup() {
		return conclusao_previsao_sup;
	}

	public void setConclusao_previsao_sup(Date conclusao_previsao_sup) {
		this.conclusao_previsao_sup = conclusao_previsao_sup;
	}

	public String getNome_curso_sup() {
		return nome_curso_sup;
	}

	public void setNome_curso_sup(String nome_curso_sup) {
		this.nome_curso_sup = nome_curso_sup;
	}

	public String getInst_pos_graduacao() {
		return inst_pos_graduacao;
	}

	public void setInst_pos_graduacao(String inst_pos_graduacao) {
		this.inst_pos_graduacao = inst_pos_graduacao;
	}

	public Date getConclusao_previsao_pos() {
		return conclusao_previsao_pos;
	}

	public void setConclusao_previsao_pos(Date conclusao_previsao_pos) {
		this.conclusao_previsao_pos = conclusao_previsao_pos;
	}

	public String getNome_curso_pos() {
		return nome_curso_pos;
	}

	public void setNome_curso_pos(String nome_curso_pos) {
		this.nome_curso_pos = nome_curso_pos;
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
		FormacaoEducacional other = (FormacaoEducacional) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
