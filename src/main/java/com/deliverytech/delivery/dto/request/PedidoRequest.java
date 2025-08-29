package com.deliverytech.delivery.dto.request;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import com.deliverytech.delivery.model.Endereco;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Representa um pedido feito por um cliente")
public class PedidoRequest {
    @NotNull
    @Schema(description = "ID do cliente que está fazendo o pedido", 
    example = "1")
    private Long clienteId;

    @NotNull
    @Schema(description = "ID do restaurante onde o pedido está sendo feito", 
    example = "2")
    private Long restauranteId;

    @NotNull
    @Schema(description = "Endereço de entrega do pedido")
    private Endereco enderecoEntrega;

    @NotNull
    @Schema(description = "Lista de itens que compõem o pedido")
    private List<ItemPedidoRequest> itens;
}