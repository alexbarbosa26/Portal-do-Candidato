package com.alex.portalcandidado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repo;
	
	public List<Candidato> findAll() {
		return repo.findAll();
	}

}
