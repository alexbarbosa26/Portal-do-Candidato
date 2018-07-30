package com.alex.portalcandidado.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alex.portalcandidado.domain.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{
	
	@Transactional(readOnly=true)
	@Query("SELECT DISTINCT obj FROM Candidato obj INNER JOIN obj.documentos acc WHERE acc.cpf LIKE %:cpf%")
	public List<Candidato> findCpf(@Param("cpf") String cpf);
	
	@Transactional(readOnly=true)
	@Query("SELECT DISTINCT obj FROM Candidato obj INNER JOIN obj.documentos acc WHERE obj.nome LIKE %:nome% AND acc.cpf LIKE %:cpf% AND acc.rg LIKE %:rg%")
	public List<Candidato> findCriterios(@Param("cpf") String cpf, @Param("rg") String rg, @Param("nome") String nome);

	/*
	@Transactional(readOnly=true)
	@Query("SELECT DISTINCT obj FROM Candidato obj INNER JOIN obj.endereco e INNER JOIN Cidade c WHERE e.bairro LIKE %:bairro% AND c.nome LIKE %:cidade%")
	public List<Candidato> findCriteriosEndreco(@Param("cidade") String cidade, @Param("bairro") String bairro);
	*/
}
