package com.alex.portalcandidado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.portalcandidado.domain.CondicoesAdmissao;

@Repository
public interface CondicoesRepository extends JpaRepository<CondicoesAdmissao, Integer>{

}
