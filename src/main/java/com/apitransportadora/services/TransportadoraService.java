package com.apitransportadora.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apitransportadora.domain.Transportadora;
import com.apitransportadora.repositories.TransportadoraRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class TransportadoraService {
	
	@Autowired
	private TransportadoraRepository repo;
	
	public Transportadora find(Integer id) throws ObjectNotFoundException {
		
		Optional<Transportadora> target = this.repo.findById(id);
		
		if(target == null) {
			throw new ObjectNotFoundException("Transportadora not Found! Id: "+id);
		}

		return target.orElse(null);
	}
	
	public List<Transportadora> getAll() {
		return this.repo.findAll();
	}
	
	public Transportadora insert(Transportadora request) {
		//request.setId(null); //Garante que não há id então o método save irá de fato inserir um novo registro
		
		return this.repo.save(request);
	}
	
	public void edit(Transportadora request) throws ObjectNotFoundException {
		find(request.getId());
		
		this.repo.save(request);
	}
	
	public void delete(Integer id) throws ObjectNotFoundException {
		Transportadora target = find(id);
		
		this.repo.delete(target);
	}
	
}
