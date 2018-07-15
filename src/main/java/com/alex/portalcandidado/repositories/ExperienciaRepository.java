package com.alex.portalcandidado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.portalcandidado.domain.ExperienciaProfissional;

@Repository
public interface ExperienciaRepository extends JpaRepository<ExperienciaProfissional, Integer>{

}
