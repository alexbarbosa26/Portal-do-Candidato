package com.alex.portalcandidado;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.domain.Cidade;
import com.alex.portalcandidado.domain.Endereco;
import com.alex.portalcandidado.domain.Estado;
import com.alex.portalcandidado.enums.EstadoCivil;
import com.alex.portalcandidado.repositories.CandidatoRepository;
import com.alex.portalcandidado.repositories.CidadeRepository;
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
		cand1.getTelefones().addAll(Arrays.asList("81-988697697","81-39747838"));
		
		Endereco end1= new Endereco(null, "Rua Rossine Rusvelt de Albuquerque", "3", "Piedade", "54410-310", "Apto 35", cid1, cand1);
		
		cand1.getEndereco().addAll(Arrays.asList(end1));
		
		repoCandidato.save(Arrays.asList(cand1));
		repoEndereco.save(Arrays.asList(end1));
		
	}
}
