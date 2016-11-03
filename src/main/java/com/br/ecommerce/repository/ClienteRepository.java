package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
