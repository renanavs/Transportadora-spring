package com.apitransportadora.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apitransportadora.domain.Transportadora;

@RestController
@RequestMapping(value="/transportadora")
public class TransportadoraResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Transportadora> list() {
		
		Transportadora transp1 = new Transportadora(1, "null", "null", "null", "null", "null", "null", "null", "null", "null", "null");
		Transportadora transp2 = new Transportadora(2, "null", "null", "null", "null", "null", "null", "null", "null", "null", "null");
		
		List<Transportadora> list = new ArrayList<Transportadora>();
		
		list.add(transp1);
		list.add(transp2);
		
		return list;
	}
}
