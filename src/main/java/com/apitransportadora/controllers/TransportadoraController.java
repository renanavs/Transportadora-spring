package com.apitransportadora.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.apitransportadora.domain.Transportadora;
import com.apitransportadora.services.TransportadoraService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/transportadora")
public class TransportadoraController {
	
	@Autowired
	private TransportadoraService service;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list() {
		
		return ResponseEntity.ok().body(service.getAll());
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> info(@PathVariable Integer id) throws ObjectNotFoundException {
		Transportadora target = service.find(id);
		
		return ResponseEntity.ok().body(target);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> store(@RequestBody Transportadora request) {
		Transportadora obj = service.insert(request);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Transportadora request, @PathVariable Integer id) throws ObjectNotFoundException {
		
		request.setId(id);
		service.edit(request);
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> destroy(@PathVariable Integer id) throws ObjectNotFoundException {
				
		service.delete(id);
		
		return ResponseEntity.noContent().build();	
	}
	
}
