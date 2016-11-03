package com.br.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecommerce.domain.Cliente;
import com.br.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> listarTodos() {
		return repository.findAll();
	}
	
	public Cliente listarId(Long id) {
		return repository.findOne(id);
	}
	
	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);
	}
	
	public void atualizar(Cliente cliente) {
		repository.save(cliente);
	}
	
	public void deletar(Long id) {
		repository.delete(id);
	}

}
