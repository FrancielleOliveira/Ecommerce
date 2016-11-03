package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
