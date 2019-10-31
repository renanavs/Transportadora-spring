package com.apitransportadora.resources;

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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> store(@RequestBody Transportadora request) {
		Transportadora obj = service.insert(request);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
					.path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<Void> destroy() {
		return ResponseEntity.ok().body(null);		
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Void> update() {
		return ResponseEntity.ok().body(null);
	}
}
