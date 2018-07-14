package com.alex.portalcandidado.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OutrosCursos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String conhece_infor;
	private String conhece_idioma;
	private String qual_idioma;
	private String outros_cursos;
	
	@OneToOne
	@JoinColumn(name="candidato_cod")
	private Candidato candidato;
	
	public OutrosCursos() {
		
	}

	public OutrosCursos(Integer codigo, String conhece_infor, String conhece_idioma, String qual_idioma,
			String outros_cursos,Candidato candidato) {
		super();
		this.codigo = codigo;
		this.conhece_infor = conhece_infor;
		this.conhece_idioma = conhece_idioma;
		this.qual_idioma = qual_idioma;
		this.outros_cursos = outros_cursos;
		this.candidato=candidato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getConhece_infor() {
		return conhece_infor;
	}

	public void setConhece_infor(String conhece_infor) {
		this.conhece_infor = conhece_infor;
	}

	public String getConhece_idioma() {
		return conhece_idioma;
	}

	public void setConhece_idioma(String conhece_idioma) {
		this.conhece_idioma = conhece_idioma;
	}

	public String getQual_idioma() {
		return qual_idioma;
	}

	public void setQual_idioma(String qual_idioma) {
		this.qual_idioma = qual_idioma;
	}

	public String getOutros_cursos() {
		return outros_cursos;
	}

	public void setOutros_cursos(String outros_cursos) {
		this.outros_cursos = outros_cursos;
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
		OutrosCursos other = (OutrosCursos) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	

}
