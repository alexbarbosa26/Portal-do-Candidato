package com.alex.portalcandidado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.domain.Cidade;
import com.alex.portalcandidado.domain.DadosPessoais;
import com.alex.portalcandidado.domain.Documentos;
import com.alex.portalcandidado.domain.Endereco;
import com.alex.portalcandidado.domain.Estado;
import com.alex.portalcandidado.dto.CandidatoDTO;
import com.alex.portalcandidado.enums.EstadoCivil;
import com.alex.portalcandidado.enums.TipoSimNao;
import com.alex.portalcandidado.repositories.CandidatoRepository;
import com.alex.portalcandidado.repositories.CidadeRepository;
import com.alex.portalcandidado.repositories.DadosPessoaisRepository;
import com.alex.portalcandidado.repositories.DocumentosRepository;
import com.alex.portalcandidado.repositories.EnderecoRepository;
import com.alex.portalcandidado.repositories.EstadoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repo;
	
	@Autowired
	private CidadeRepository repoCidade;
	
	@Autowired
	private EnderecoRepository repoEndereco;
	
	@Autowired
	private EstadoRepository repoEstado;
	
	@Autowired
	private DocumentosRepository repoDoc;
	
	@Autowired
	private DadosPessoaisRepository repoDados;
	
	public List<Candidato> findAll() {
		return repo.findAll();
	}
	
	public Candidato insert(Candidato obj) {
		obj.setCodigo(null);
		obj = repo.save(obj);
		repoEndereco.save(obj.getEndereco());
		repoDoc.save(obj.getDocumentos());
		repoDados.save(obj.getDadosPessoais());
		return repo.save(obj);
	}
	
	//---------------------------------------------
	public Candidato fromDTO(CandidatoDTO objDto) {
				
		//-----------------------------------------
		Candidato cand = new Candidato(
				null,
				objDto.getNome(),
				objDto.getEmail(),
				objDto.getRaca(),
				objDto.getData_nascimento(),
				objDto.getIdade(),
				objDto.getNaturalidade(),
				EstadoCivil.toEnum(objDto.getEstado_civil())
				);
		//------------------------------------------
		Cidade cid = repoCidade.findOne(objDto.getCidadeCod());
		//------------------------------------------
		Endereco end = new Endereco(
				null,
				objDto.getLogradouro(),
				objDto.getNumero(),
				objDto.getBairro(),
				objDto.getCep(),
				objDto.getComplemento(), cid, cand);
		
		//------------------------------------------
		Estado est = repoEstado.findOne(objDto.getEstado_emissor_cod());
		//-----------------------------------------
		
		Documentos doc = new Documentos(
				null,
				objDto.getRg(),
				objDto.getData_emissao_rg(),
				objDto.getOrgao_emissor_rg(),
				objDto.getTitulo_eleitor(),
				objDto.getZona(),
				objDto.getSecao(),
				TipoSimNao.toEnum(objDto.getPis_pasep()),
				objDto.getNumero_pis(),
				objDto.getCpf(),
				objDto.getNumero_reservista(),
				objDto.getCategoria(),
				objDto.getCarteira_trab(),
				objDto.getSerie(),
				objDto.getData_emissao_ct(),
				est,cand);
		//------------------------------------------
		
		DadosPessoais da = new DadosPessoais(
				null,
				objDto.getFonte_recrutamento(),
				objDto.getData_cadastro(),
				objDto.getNome_pai(),
				objDto.getNome_mae(),
				TipoSimNao.toEnum(objDto.getTem_filhos()),
				objDto.getIdade(),
				objDto.getQuantas_conducoes(),
				objDto.getValor_conducao(),
				objDto.getQuais_conducoes(),
				objDto.getDisp_horario(),
				TipoSimNao.toEnum(objDto.getDisp_sab_dom()),
				TipoSimNao.toEnum(objDto.getTrab_neo_tvt_tel()),
				objDto.getPeriodo_trab(),
				TipoSimNao.toEnum(objDto.getProcesso_neobpo()),
				objDto.getQual_produto(),
				TipoSimNao.toEnum(objDto.getTrabalhou_telemk()),
				objDto.getTipo_telemk(),
				objDto.getQuanto_tempo(),
				objDto.getQuais_produtos(),
				TipoSimNao.toEnum(objDto.getParentes_neobpo()),
				objDto.getNome_parentes(),
				TipoSimNao.toEnum(objDto.getPortador_def()),
				objDto.getQual_def(), cand);
		//------------------------------------------
		cand.getTelefones().add(objDto.getTelefone1());
		
		cand.getEndereco().add(end);
		cand.setDocumentos(doc);
		cand.setDadosPessoais(da);		
		
		if(objDto.getTelefone2()!=null) {
			cand.getTelefones().add(objDto.getTelefone2());
		}
		if(objDto.getTelefone3()!=null) {
			cand.getTelefones().add(objDto.getTelefone3());
		}
		if(objDto.getTelefone4()!=null) {
			cand.getTelefones().add(objDto.getTelefone4());
		}
		
		return cand;
		
	}

}
