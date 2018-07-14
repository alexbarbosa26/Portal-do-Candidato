package com.alex.portalcandidado;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.domain.Cidade;
import com.alex.portalcandidado.domain.DadosPessoais;
import com.alex.portalcandidado.domain.Documentos;
import com.alex.portalcandidado.domain.Endereco;
import com.alex.portalcandidado.domain.Estado;
import com.alex.portalcandidado.enums.EstadoCivil;
import com.alex.portalcandidado.enums.TipoSimNao;
import com.alex.portalcandidado.repositories.CandidatoRepository;
import com.alex.portalcandidado.repositories.CidadeRepository;
import com.alex.portalcandidado.repositories.DadosPessoaisRepository;
import com.alex.portalcandidado.repositories.DocumentosRepository;
import com.alex.portalcandidado.repositories.EnderecoRepository;
import com.alex.portalcandidado.repositories.EstadoRepository;

@SpringBootApplication
public class PortalcandidatoApplication implements CommandLineRunner{

	@Autowired
	private EstadoRepository repoEstado;
	
	@Autowired
	private CidadeRepository repoCidade;
	
	@Autowired
	private CandidatoRepository repoCandidato;
	
	@Autowired
	private EnderecoRepository repoEndereco;
	
	@Autowired
	private DocumentosRepository repoDoc;
	
	@Autowired
	private DadosPessoaisRepository repoDados;
	
	public static void main(String[] args) {
		SpringApplication.run(PortalcandidatoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		Estado est1 = new Estado(null, "PE");
		Estado est2 = new Estado(null, "SP");
		
		Cidade cid1 = new Cidade(null, "Jaboatão dos Guararapes", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1));		
		
		est2.getCidades().addAll(Arrays.asList(cid2));
		
		repoEstado.save(Arrays.asList(est1,est2));
		repoCidade.save(Arrays.asList(cid1,cid2));
		
		//--------------------------------------------------------------
		
		Candidato cand1 = new Candidato(null, "Alex Barbosa da Silva", "abarbosasilva7@gmail.com", "Branco", date.parse("26/11/1990"), "27", "Brasileiro", EstadoCivil.SOLTEIRO);
		cand1.getTelefones().addAll(Arrays.asList("(81) 98869-7697","(81) 3974-7838"));
		
		Endereco end1= new Endereco(null, "Rua Rossine Rusvelt de Albuquerque", "3", "Piedade", "54410-310", "Apto 35", cid1, cand1);
		DadosPessoais dp1=new DadosPessoais(null, "Agencia do Trabalho", date.parse("14/07/2018"), "Edson Barbosa da Silva", "Lucidalva Santos da Silva", TipoSimNao.NAO, null, "2", 6.40, "Onibus Municipal", "Integral", TipoSimNao.NAO, TipoSimNao.NAO, null, TipoSimNao.NAO, null, TipoSimNao.NAO, null, null, null, TipoSimNao.NAO, null, TipoSimNao.NAO, null, cand1);
		Documentos doc1 = new Documentos(null, "59.792.668-2", date.parse("09/04/2015"), "SSPSP", "123556340515", "177", "0184", TipoSimNao.SIM, "16021112270", "051.113.335-92", "181042050920", "Dispensado", "042435", "00377-SP", date.parse("12/04/2010"), est2, cand1);
		
		
		cand1.getEndereco().addAll(Arrays.asList(end1));
						
		repoCandidato.save(Arrays.asList(cand1));
		repoEndereco.save(Arrays.asList(end1));
		repoDados.save(Arrays.asList(dp1));
		repoDoc.save(Arrays.asList(doc1));
		
		
		//--------------------------------------------------------------
	}
}
