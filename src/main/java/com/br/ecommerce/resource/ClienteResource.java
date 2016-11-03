package com.br.ecommerce.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.ecommerce.domain.Cliente;
import com.br.ecommerce.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService  service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listarTodos() {
		return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
	}
	
	@RequestMapping(value = "{/id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> listarId(@PathVariable("id") Long id) {
		Cliente cliente = service.listarId(id);
		return ResponseEntity.status(HttpStatus.OK).body(cliente);		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody Cliente cliente) {
		cliente = service.salvar(cliente);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(cliente.getIdCliente()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "{/id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Cliente cliente) {
		service.atualizar(cliente);
		return ResponseEntity.noContent().build();
	}
	
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		service.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
