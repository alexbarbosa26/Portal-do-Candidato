package com.alex.portalcandidado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.alex.portalcandidado.enums.EstadoCivil;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Candidato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String nome;
	
	@Column(unique=true)
	private String email;
	private String raca;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_nascimento;
	private String idade;
	private String naturalidade;
	private Integer estado_civil;
	
	@ElementCollection
	@CollectionTable(name="TELEFONE")
	@Column(unique=true)
	private Set<String> telefones = new HashSet<>();
	
	@OneToMany(mappedBy="candidato")
	private List<Endereco> endereco = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="candidato")
	private Documentos documentos;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="candidato")
	private DadosPessoais dadosPessoais;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="candidato")
	private FormacaoEducacional educacional;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="candidato")
	private OutrosCursos cursos;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="candidato")
	private ExperienciaProfissional experiencia;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="candidato")
	private CondicoesAdmissao condicoes;
	
	public Candidato() {
		
	}

	public Candidato(Integer codigo, String nome, String email, String raca, Date data_nascimento, String idade,
			String naturalidade, EstadoCivil estado_civil) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.raca = raca;
		this.data_nascimento = data_nascimento;
		this.idade = idade;
		this.naturalidade = naturalidade;
		this.estado_civil = estado_civil.getCod();
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

	public EstadoCivil getEstado_civil() {
		return EstadoCivil.toEnum(estado_civil);
	}

	public void setEstado_civil(EstadoCivil estado_civil) {
		this.estado_civil = estado_civil.getCod();
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}	

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	public FormacaoEducacional getEducacional() {
		return educacional;
	}

	public void setEducacional(FormacaoEducacional educacional) {
		this.educacional = educacional;
	}

	public OutrosCursos getCursos() {
		return cursos;
	}

	public void setCursos(OutrosCursos cursos) {
		this.cursos = cursos;
	}	

	public ExperienciaProfissional getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(ExperienciaProfissional experiencia) {
		this.experiencia = experiencia;
	}

	public CondicoesAdmissao getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(CondicoesAdmissao condicoes) {
		this.condicoes = condicoes;
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
		Candidato other = (Candidato) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	
}
