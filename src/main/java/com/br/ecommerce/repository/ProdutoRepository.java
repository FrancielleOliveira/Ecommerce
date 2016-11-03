package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
