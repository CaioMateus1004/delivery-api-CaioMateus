package com.deliverytech.delivery.Service;

import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery.model.Produto;

public interface ProdutoService {
    Produto cadastrar(Produto produto);
    Produto atualizar(Long id, Produto produtoAtualizado);
    Optional<Produto> buscarPorId (Long id1);
    void alterarDisponibilidade (Long id, boolean disponivel);

    List<Produto> buscarPorRestaurante(Long restauranteId);
    
}
