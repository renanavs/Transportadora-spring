package com.apitransportadora.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apitransportadora.domain.Transportadora;
import com.apitransportadora.services.TransportadoraService;

@RestController
@RequestMapping(value="/transportadora")
public class TransportadoraResource {
	
	@Autowired
	private TransportadoraService service;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list() {
		
		return ResponseEntity.ok().body(service.getAll());
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> info(@PathVariable Integer id) {
		Transportadora target = service.find(id);
		
		return ResponseEntity.ok().body(target);
	}
}
