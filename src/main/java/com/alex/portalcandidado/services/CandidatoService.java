package com.alex.portalcandidado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.dto.CandidatoDTO;
import com.alex.portalcandidado.enums.EstadoCivil;
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
		
		cand.getTelefones().add(objDto.getTelefone1());
		
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
