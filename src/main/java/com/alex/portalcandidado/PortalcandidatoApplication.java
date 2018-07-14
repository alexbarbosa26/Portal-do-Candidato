package com.alex.portalcandidado;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alex.portalcandidado.domain.Cidade;
import com.alex.portalcandidado.domain.Estado;
import com.alex.portalcandidado.repositories.CidadeRepository;
import com.alex.portalcandidado.repositories.EstadoRepository;

@SpringBootApplication
public class PortalcandidatoApplication implements CommandLineRunner{

	@Autowired
	private EstadoRepository repoEstado;
	
	@Autowired
	private CidadeRepository repoCidade;
	
	public static void main(String[] args) {
		SpringApplication.run(PortalcandidatoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estado est1 = new Estado(null, "PE");
		Estado est2 = new Estado(null, "SP");
		
		Cidade cid1 = new Cidade(null, "Jaboatão dos Guararapes", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2));
		
		repoEstado.save(Arrays.asList(est1,est2));
		repoCidade.save(Arrays.asList(cid1,cid2));
		
	}
}
