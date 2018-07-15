package com.alex.portalcandidado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.portalcandidado.domain.OutrosCursos;

@Repository
public interface OutrosCursosRepository extends JpaRepository<OutrosCursos, Integer>{

}
