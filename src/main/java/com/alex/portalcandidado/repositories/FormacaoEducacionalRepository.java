package com.alex.portalcandidado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.portalcandidado.domain.FormacaoEducacional;

@Repository
public interface FormacaoEducacionalRepository extends JpaRepository<FormacaoEducacional, Integer>{

}
