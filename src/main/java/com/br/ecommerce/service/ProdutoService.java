package com.br.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecommerce.domain.Produto;
import com.br.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> listarTodos() {
		return repository.findAll();
	}
	
	public Produto listarId(Long id) {
		return repository.findOne(id);
	}
	
	public Produto salvar(Produto produto) {
		return repository.save(produto);
	}
	
	public void atualizar(Produto produto) {
		repository.save(produto);
	}
	
	public void deletar(Long id) {
		repository.delete(id);
	}
	
}
