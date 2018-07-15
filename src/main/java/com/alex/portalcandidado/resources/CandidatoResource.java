package com.alex.portalcandidado.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.services.CandidatoService;

@RestController
@RequestMapping(value="/candidato")
public class CandidatoResource {

	@Autowired
	private CandidatoService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findAll(){
		
		List<Candidato> obj=service.findAll();
		
		return ResponseEntity.ok().body(obj);
	}
}
