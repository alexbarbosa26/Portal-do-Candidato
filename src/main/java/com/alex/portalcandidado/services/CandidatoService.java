package com.alex.portalcandidado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.dto.CandidatoDTO;
import com.alex.portalcandidado.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repo;
	
	public List<Candidato> findAll() {
		return repo.findAll();
	}
	
	public Candidato insert(Candidato obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public Candidato fromDTO(CandidatoDTO objDto) {
		return new Candidato(objDto.getCodigo(), objDto.getNome(), objDto.getEmail(), objDto.getRaca(), objDto.getData_nascimento(), objDto.getIdade(), objDto.getNaturalidade(), null);
	}

}
