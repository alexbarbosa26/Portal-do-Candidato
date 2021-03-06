package com.alex.portalcandidado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.portalcandidado.domain.DadosPessoais;

@Repository
public interface DadosPessoaisRepository extends JpaRepository<DadosPessoais, Integer>{

}
