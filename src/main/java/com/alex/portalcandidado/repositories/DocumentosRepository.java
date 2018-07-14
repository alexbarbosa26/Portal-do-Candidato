package com.alex.portalcandidado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.portalcandidado.domain.Documentos;

@Repository
public interface DocumentosRepository extends JpaRepository <Documentos,Integer> {

}
