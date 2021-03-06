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
	//-----------------------------------------------
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 150, message = "Deve conter entre 5 e 150 caracteres")
	private String nome;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Email(message = "E-mail inválido")
	private String email;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String raca;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	private String sexo;
	
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
	
	private String fonte_recrutamento;
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date data_cadastro;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String nome_pai;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String nome_mae;
	private Integer tem_filhos;
	private String idade_filhos;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String quantas_conducoes;	
	private Double valor_conducao;
	@NotEmpty(message = "Preenchimento obrigatório")
	private String quais_conducoes;
	@NotEmpty(message = "Preenchimento obrigatório")
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
	
	//-----------------------------------------------
	
	private String inst_ensino_medio;
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date conclusao_ens_med;
	private String nome_curso_tec;
	private String inst_graduacao_sup;
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date conclusao_previsao_sup;
	private String nome_curso_sup;
	private String inst_pos_graduacao;
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	private Date conclusao_previsao_pos;
	private String nome_curso_pos;
	
	//-----------------------------------------------
	private String conhece_infor;
	private String conhece_idioma;
	private String qual_idioma;
	private String outros_cursos;
	//-----------------------------------------------
	private String empresa_atual_ultima;
	private String endereco;
	private String telefone;
	private String ultimo_cargo;
	private String ultimo_periodo_trab;
	private Double ultimo_Salario;
	//-----------------------------------------------
	private String cargo_pretendido;
	private Double pretensao_salarial;
	private Integer periodo_experiencia;
	private Integer pagou_cont_sindical;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public Integer getTem_filhos() {
		return tem_filhos;
	}

	public void setTem_filhos(Integer tem_filhos) {
		this.tem_filhos = tem_filhos;
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

	public Integer getDisp_sab_dom() {
		return disp_sab_dom;
	}

	public void setDisp_sab_dom(Integer disp_sab_dom) {
		this.disp_sab_dom = disp_sab_dom;
	}

	public Integer getTrab_neo_tvt_tel() {
		return trab_neo_tvt_tel;
	}

	public void setTrab_neo_tvt_tel(Integer trab_neo_tvt_tel) {
		this.trab_neo_tvt_tel = trab_neo_tvt_tel;
	}

	public String getPeriodo_trab() {
		return periodo_trab;
	}

	public void setPeriodo_trab(String periodo_trab) {
		this.periodo_trab = periodo_trab;
	}

	public Integer getProcesso_neobpo() {
		return processo_neobpo;
	}

	public void setProcesso_neobpo(Integer processo_neobpo) {
		this.processo_neobpo = processo_neobpo;
	}

	public String getQual_produto() {
		return qual_produto;
	}

	public void setQual_produto(String qual_produto) {
		this.qual_produto = qual_produto;
	}

	public Integer getTrabalhou_telemk() {
		return trabalhou_telemk;
	}

	public void setTrabalhou_telemk(Integer trabalhou_telemk) {
		this.trabalhou_telemk = trabalhou_telemk;
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

	public Integer getParentes_neobpo() {
		return parentes_neobpo;
	}

	public void setParentes_neobpo(Integer parentes_neobpo) {
		this.parentes_neobpo = parentes_neobpo;
	}

	public String getNome_parentes() {
		return nome_parentes;
	}

	public void setNome_parentes(String nome_parentes) {
		this.nome_parentes = nome_parentes;
	}

	public Integer getPortador_def() {
		return portador_def;
	}

	public void setPortador_def(Integer portador_def) {
		this.portador_def = portador_def;
	}

	public String getQual_def() {
		return qual_def;
	}

	public void setQual_def(String qual_def) {
		this.qual_def = qual_def;
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

	public String getUltimo_periodo_trab() {
		return ultimo_periodo_trab;
	}

	public void setUltimo_periodo_trab(String ultimo_periodo_trab) {
		this.ultimo_periodo_trab = ultimo_periodo_trab;
	}

	public Double getUltimo_Salario() {
		return ultimo_Salario;
	}

	public void setUltimo_Salario(Double ultimo_Salario) {
		this.ultimo_Salario = ultimo_Salario;
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

	public Integer getPeriodo_experiencia() {
		return periodo_experiencia;
	}

	public void setPeriodo_experiencia(Integer periodo_experiencia) {
		this.periodo_experiencia = periodo_experiencia;
	}

	public Integer getPagou_cont_sindical() {
		return pagou_cont_sindical;
	}

	public void setPagou_cont_sindical(Integer pagou_cont_sindical) {
		this.pagou_cont_sindical = pagou_cont_sindical;
	}
	
	
}
