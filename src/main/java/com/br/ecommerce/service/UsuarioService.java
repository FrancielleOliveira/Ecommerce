package com.br.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecommerce.domain.Usuario;
import com.br.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listarTodos() {
		return repository.findAll();
	}
	
	public Usuario listarId(Long id) {
		return repository.findOne(id);
	}
	
	public Usuario salvar(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public void atualizar(Usuario usuario) {
		repository.save(usuario);
	}
	
	public void deletar(Long id) {
		repository.delete(id);
	}

}
