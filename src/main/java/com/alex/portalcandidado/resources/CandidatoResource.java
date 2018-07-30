package com.alex.portalcandidado.resources;

import java.net.URI;
import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.alex.portalcandidado.domain.Candidato;
import com.alex.portalcandidado.dto.CandidatoDTO;
import com.alex.portalcandidado.services.CandidatoService;

@RestController
@RequestMapping(value = "/candidato")
public class CandidatoResource {

	@Autowired
	private CandidatoService service;

	/*
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findAll() {
		List<Candidato> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}*/

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody CandidatoDTO objDto) {

		Candidato obj = service.fromDTO(objDto);

		obj = service.insert(obj);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getCodigo())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{cpf}/documentos", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findCpf(@PathVariable String cpf) {
		List<Candidato> obj = service.findCpf(cpf);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{cpf}/{rg}/{nome}/doc", method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findCriterios(@PathVariable String cpf, @PathVariable String rg, @PathVariable String nome) {

		cpf = cpf.equals("uniformed") ? "" : cpf;
		rg = rg.equals("uniformed") ? "" : rg;
		nome = nome.equals("uniformed") ? "" : nome;
		
		List<Candidato> obj = service.findCriterios(cpf, rg, nome);

		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findCriteriosEndereco( 
			@RequestParam(value="cidade", defaultValue="") String cidade,
			@RequestParam(value="bairro", defaultValue="") String bairro,
			@RequestParam(value="disp", defaultValue="") String disp,
			@RequestParam Date dataInicio, @RequestParam Date dataFim) {
		
		List<Candidato> obj = service.finCriteriosEndereco(cidade, bairro, disp, dataInicio, dataFim);

		return ResponseEntity.ok().body(obj);
	}
	

}
