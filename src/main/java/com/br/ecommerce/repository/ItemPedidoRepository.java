package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
