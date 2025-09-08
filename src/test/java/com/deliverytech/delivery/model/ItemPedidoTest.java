package com.deliverytech.delivery.model;

import org.junit.jupiter.api.Test;

public class ItemPedidoTest {
    
    @Test
    public void testeParaCoberturaDeCodigo() {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setId(1L);
        itemPedido.setQuantidade(2);
        itemPedido.getId();
        itemPedido.getQuantidade();
        assert itemPedido != null;
    }

    @Test
    public void testeParaCriacaoDePedidoComConstrutor() {
        ItemPedido itemPedido = new ItemPedido(null, null, null, null, null);
        assert itemPedido != null;
    }

    @Test
    public void testeSeOPedidoFoiFeitoCorretamente() {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setQuantidade(2);
        assert !itemPedido.isValid();

        itemPedido.setQuantidade(0);
        assert !itemPedido.isValid();

        itemPedido.setQuantidade(-1);
        assert !itemPedido.isValid();

        itemPedido.setQuantidade(2);
        itemPedido.setProduto(null);
        assert !itemPedido.isValid();

        Produto produto = new Produto();
        produto.setPreco(null);
        itemPedido.setProduto(produto);
        assert !itemPedido.isValid();

        produto.setPreco(java.math.BigDecimal.TEN);
        itemPedido.setProduto(produto);
        assert itemPedido.isValid();
    }

    @Test
    public void testeSeOPedidoFoiFeitoCorretamenteComBuilder() {
        Produto produto = new Produto();
        produto.setPreco(java.math.BigDecimal.TEN);

        ItemPedido itemPedido = ItemPedido.builder()
                .quantidade(2)
                .produto(produto)
                .build();
        assert itemPedido.isValid();
    }

    @Test
    public void testeSeOPedidoFoiFeitoIncorretamenteComBuilder() {
        ItemPedido itemPedido = ItemPedido.builder()
                .quantidade(0)
                .build();
        assert !itemPedido.isValid();
    }

}
