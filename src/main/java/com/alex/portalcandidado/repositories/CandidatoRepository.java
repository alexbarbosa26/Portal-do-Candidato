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
	public List<Candidato> findCpf(@Param("cpf") String tag);

}
