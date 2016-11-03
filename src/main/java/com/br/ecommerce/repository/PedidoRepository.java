package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
