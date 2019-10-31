package com.apitransportadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apitransportadora.domain.Transportadora;

@Repository
public interface TransportadoraRepository extends JpaRepository<Transportadora, Integer> {

}
