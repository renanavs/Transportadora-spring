package com.apitransportadora.services;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.apitransportadora.domain.Transportadora;
import com.apitransportadora.repositories.TransportadoraRepository;

@Service
public class TransportadoraService {
	
	@Autowired
	private TransportadoraRepository repo;
	
	public Transportadora find(Integer id) {
		
		Optional<Transportadora> target = this.repo.findById(id);
		
		return target.orElse(null);
	}
	
	public List<Transportadora> getAll() {
		return this.repo.findAll();
	}
	
	public Transportadora insert(Transportadora request) {
		//request.setId(null);
		
		return this.repo.save(request);
	}
	
	public void delete(Integer id) {
		Optional<Transportadora> target = this.repo.findById(id);
		
		this.repo.delete(target.get());
	}
	
	public void edit(Transportadora request) {
		this.repo.save(request);
	}
}
