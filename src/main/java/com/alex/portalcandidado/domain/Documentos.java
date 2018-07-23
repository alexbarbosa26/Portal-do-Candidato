package com.alex.portalcandidado.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.alex.portalcandidado.enums.TipoSimNao;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Documentos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(unique=true)
	private String rg;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_emissao_rg;
	private String orgao_emissor_rg;
	
	@Column(unique=true)
	private String titulo_eleitor;
	private String zona;
	private String secao;
	private Integer pis_pasep;
	@Column(unique=true)
	private String numero_pis;
	
	@Column(unique=true)
	private String cpf;
	@Column(unique=true)
	private String numero_reservista;
	private String categoria;
	@Column(unique=true)
	private String carteira_trab;
	private String serie;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date data_emissao_ct;
	
	
	@OneToOne
	@JoinColumn(name="estado_emissor_cod")
	private Estado estado_emissor_ct;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="candidato_cod")
	private Candidato candidato;
	
	public Documentos() {
		
	}

	public Documentos(Integer codigo, String rg, Date data_emissao_rg, String orgao_emissor_rg, String titulo_eleitor,
			String zona, String secao, TipoSimNao pis_pasep, String numero_pis, String cpf, String numero_reservista,
			String categoria, String carteira_trab, String serie, Date data_emissao_ct, Estado estado_emissor_ct,Candidato candidato) {
		super();
		this.codigo = codigo;
		this.rg = rg;
		this.data_emissao_rg = data_emissao_rg;
		this.orgao_emissor_rg = orgao_emissor_rg;
		this.titulo_eleitor = titulo_eleitor;
		this.zona = zona;
		this.secao = secao;
		this.pis_pasep = pis_pasep.getCod();
		this.numero_pis = numero_pis;
		this.cpf = cpf;
		this.numero_reservista = numero_reservista;
		this.categoria = categoria;
		this.carteira_trab = carteira_trab;
		this.serie = serie;
		this.data_emissao_ct = data_emissao_ct;
		this.estado_emissor_ct = estado_emissor_ct;
		this.candidato=candidato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public TipoSimNao getPis_pasep() {
		return TipoSimNao.toEnum(pis_pasep);
	}

	public void setPis_pasep(TipoSimNao pis_pasep) {
		this.pis_pasep = pis_pasep.getCod();
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

	public Estado getEstado_emissor_ct() {
		return estado_emissor_ct;
	}

	public void setEstado_emissor_ct(Estado estado_emissor_ct) {
		this.estado_emissor_ct = estado_emissor_ct;
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
		Documentos other = (Documentos) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
