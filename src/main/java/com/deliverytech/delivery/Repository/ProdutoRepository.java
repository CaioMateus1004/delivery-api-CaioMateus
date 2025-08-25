package com.deliverytech.delivery.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByRestauranteId(Long restaurante);
    List<Produto> findByDisponivelTrue();
    List<Produto> findByCategoria(String categoria);
}
