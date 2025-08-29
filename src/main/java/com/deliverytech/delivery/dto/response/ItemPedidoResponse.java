package com.deliverytech.delivery.dto.response;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Detalhes do item do pedido", 
example = "{\"produtoId\":1,\"nomeProduto\":\"Pizza de Calabresa\",\"quantidade\":2,\"precoUnitario\":29.90}")
public class ItemPedidoResponse {
    @Schema(description = "ID do produto", example = "1")
    private Long produtoId;
    @Schema(description = "Nome do produto", example = "Pizza de Calabresa")
    private String nomeProduto;
    @Schema(description = "Quantidade do produto", example = "2")
    private Integer quantidade;
    @Schema(description = "Preço unitário do produto", example = "29.90")
    private BigDecimal precoUnitario;    
}
