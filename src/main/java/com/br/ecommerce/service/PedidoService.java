package com.br.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecommerce.domain.Pedido;
import com.br.ecommerce.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> listarTodos() {
		return repository.findAll();
	}
	
	public Pedido listarId(Long id) {
		return repository.findOne(id);
	}
	
	public Pedido salvar(Pedido pedido) {
		return repository.save(pedido);
	}
	
	public void atualizar(Pedido pedido) {
		repository.save(pedido);
	}
	
	public void deletar(Long id) {
		repository.delete(id);
	}

}
