package com.alex.portalcandidado.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.alex.portalcandidado.enums.TipoSimNao;

@Entity
public class DadosPessoais implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	private String fonte_recrutamento;
	private Date data_cadastro;
	private String nome_pai;
	private String nome_mae;
	private Integer tem_filhos;
	private String idade_filhos;
	private String quantas_conducoes;
	private Double valor_conducao;
	private String quais_conducoes;
	private String disp_horario;
	private Integer disp_sab_dom;
	private Integer trab_neo_tvt_tel;
	private String periodo_trab;
	private Integer processo_neobpo;
	private String qual_produto;
	private Integer trabalhou_telemk;
	private String tipo_telemk;
	private String quanto_tempo;
	private String quais_produtos;
	private Integer parentes_neobpo;
	private String nome_parentes;
	private Integer portador_def;
	private String qual_def;
	
	@OneToOne
	@JoinColumn(name="candidato_cod")
	private Candidato candidato;
	
	public DadosPessoais() {
		
	}
	
	public DadosPessoais(Integer codigo, String fonte_recrutamento, Date data_cadastro, String nome_pai,
			String nome_mae, TipoSimNao tem_filhos, String idade_filhos, String quantas_conducoes,
			Double valor_conducao, String quais_conducoes, String disp_horario, TipoSimNao disp_sab_dom,
			TipoSimNao trab_neo_tvt_tel, String periodo_trab, TipoSimNao processo_neobpo, String qual_produto,
			TipoSimNao trabalhou_telemk, String tipo_telemk, String quanto_tempo, String quais_produtos,
			TipoSimNao parentes_neobpo, String nome_parentes, TipoSimNao portador_def, String qual_def,
			Candidato candidato) {
		super();
		this.codigo = codigo;
		this.fonte_recrutamento = fonte_recrutamento;
		this.data_cadastro = data_cadastro;
		this.nome_pai = nome_pai;
		this.nome_mae = nome_mae;
		this.tem_filhos = tem_filhos.getCod();
		this.idade_filhos = idade_filhos;
		this.quantas_conducoes = quantas_conducoes;
		this.valor_conducao = valor_conducao;
		this.quais_conducoes = quais_conducoes;
		this.disp_horario = disp_horario;
		this.disp_sab_dom = disp_sab_dom.getCod();
		this.trab_neo_tvt_tel = trab_neo_tvt_tel.getCod();
		this.periodo_trab = periodo_trab;
		this.processo_neobpo = processo_neobpo.getCod();
		this.qual_produto = qual_produto;
		this.trabalhou_telemk = trabalhou_telemk.getCod();
		this.tipo_telemk = tipo_telemk;
		this.quanto_tempo = quanto_tempo;
		this.quais_produtos = quais_produtos;
		this.parentes_neobpo = parentes_neobpo.getCod();
		this.nome_parentes = nome_parentes;
		this.portador_def = portador_def.getCod();
		this.qual_def = qual_def;
		
		this.candidato=candidato;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getFonte_recrutamento() {
		return fonte_recrutamento;
	}

	public void setFonte_recrutamento(String fonte_recrutamento) {
		this.fonte_recrutamento = fonte_recrutamento;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getNome_pai() {
		return nome_pai;
	}

	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	public TipoSimNao getTem_filhos() {
		return TipoSimNao.toEnum(tem_filhos);
	}

	public void setTem_filhos(TipoSimNao tem_filhos) {
		this.tem_filhos = tem_filhos.getCod();
	}

	public String getIdade_filhos() {
		return idade_filhos;
	}

	public void setIdade_filhos(String idade_filhos) {
		this.idade_filhos = idade_filhos;
	}

	public String getQuantas_conducoes() {
		return quantas_conducoes;
	}

	public void setQuantas_conducoes(String quantas_conducoes) {
		this.quantas_conducoes = quantas_conducoes;
	}

	public Double getValor_conducao() {
		return valor_conducao;
	}

	public void setValor_conducao(Double valor_conducao) {
		this.valor_conducao = valor_conducao;
	}

	public String getQuais_conducoes() {
		return quais_conducoes;
	}

	public void setQuais_conducoes(String quais_conducoes) {
		this.quais_conducoes = quais_conducoes;
	}

	public String getDisp_horario() {
		return disp_horario;
	}

	public void setDisp_horario(String disp_horario) {
		this.disp_horario = disp_horario;
	}

	public TipoSimNao getDisp_sab_dom() {
		return TipoSimNao.toEnum(disp_sab_dom);
	}

	public void setDisp_sab_dom(TipoSimNao disp_sab_dom) {
		this.disp_sab_dom = disp_sab_dom.getCod();
	}

	public TipoSimNao getTrab_neo_tvt_tel() {
		return TipoSimNao.toEnum(trab_neo_tvt_tel);
	}

	public void setTrab_neo_tvt_tel(TipoSimNao trab_neo_tvt_tel) {
		this.trab_neo_tvt_tel = trab_neo_tvt_tel.getCod();
	}

	public String getPeriodo_trab() {
		return periodo_trab;
	}

	public void setPeriodo_trab(String periodo_trab) {
		this.periodo_trab = periodo_trab;
	}

	public TipoSimNao getProcesso_neobpo() {
		return TipoSimNao.toEnum(processo_neobpo);
	}

	public void setProcesso_neobpo(TipoSimNao processo_neobpo) {
		this.processo_neobpo = processo_neobpo.getCod();
	}

	public String getQual_produto() {
		return qual_produto;
	}

	public void setQual_produto(String qual_produto) {
		this.qual_produto = qual_produto;
	}

	public TipoSimNao getTrabalhou_telemk() {
		return TipoSimNao.toEnum(trabalhou_telemk);
	}

	public void setTrabalhou_telemk(TipoSimNao trabalhou_telemk) {
		this.trabalhou_telemk = trabalhou_telemk.getCod();
	}

	public String getTipo_telemk() {
		return tipo_telemk;
	}

	public void setTipo_telemk(String tipo_telemk) {
		this.tipo_telemk = tipo_telemk;
	}

	public String getQuanto_tempo() {
		return quanto_tempo;
	}

	public void setQuanto_tempo(String quanto_tempo) {
		this.quanto_tempo = quanto_tempo;
	}

	public String getQuais_produtos() {
		return quais_produtos;
	}

	public void setQuais_produtos(String quais_produtos) {
		this.quais_produtos = quais_produtos;
	}

	public TipoSimNao getParentes_neobpo() {
		return TipoSimNao.toEnum(parentes_neobpo);
	}

	public void setParentes_neobpo(TipoSimNao parentes_neobpo) {
		this.parentes_neobpo = parentes_neobpo.getCod();
	}

	public String getNome_parentes() {
		return nome_parentes;
	}

	public void setNome_parentes(String nome_parentes) {
		this.nome_parentes = nome_parentes;
	}

	public TipoSimNao getPortador_def() {
		return TipoSimNao.toEnum(portador_def);
	}

	public void setPortador_def(TipoSimNao portador_def) {
		this.portador_def = portador_def.getCod();
	}

	public String getQual_def() {
		return qual_def;
	}

	public void setQual_def(String qual_def) {
		this.qual_def = qual_def;
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
		DadosPessoais other = (DadosPessoais) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	

}
