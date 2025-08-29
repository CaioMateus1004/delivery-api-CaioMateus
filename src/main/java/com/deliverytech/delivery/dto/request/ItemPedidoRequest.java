package com.deliverytech.delivery.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Representa um item dentro de um pedido")
public class ItemPedidoRequest {
    @NotNull
    @Schema(description = "ID do produto que está sendo pedido", 
    example = "1")
    private Long produtoId;

    @Positive
    @Schema(description = "Quantidade do produto que está sendo pedido", 
    example = "2")
    private Integer quantidade;
}
