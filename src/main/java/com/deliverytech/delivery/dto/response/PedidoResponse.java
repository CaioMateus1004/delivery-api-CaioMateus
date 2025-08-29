package com.deliverytech.delivery.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import com.deliverytech.delivery.model.Endereco;
import com.deliverytech.delivery.model.StatusPedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Representa um pedido realizado por um cliente", 
example = "{\"id\":1,\"clienteId\":42,\"restauranteId\":7,\"enderecoEntrega\":{\"rua\":\"Av. Paulista\",\"numero\":\"1000\",\"cidade\":\"São Paulo\",\"estado\":\"SP\",\"cep\":\"01310-100\"},\"total\":59.99,\"status\":\"PENDENTE\",\"dataPedido\":\"2023-10-05T14:30:00\",\"itens\":[{\"produtoId\":3,\"quantidade\":2,\"precoUnitario\":19.99,\"precoTotal\":39.98},{\"produtoId\":5,\"quantidade\":1,\"precoUnitario\":20.01,\"precoTotal\":20.01}]}")
public class PedidoResponse {
    @Schema(description = "ID do pedido", example = "1")
    private Long id;
    @Schema(description = "ID do cliente que fez o pedido", example = "42")
    private Long clienteId;
    @Schema(description = "ID do restaurante onde o pedido foi feito", example = "7")
    private Long restauranteId;
    @Schema(description = "Endereço de entrega do pedido")
    private Endereco enderecoEntrega;
    @Schema(description = "Valor total do pedido", example = "59.99")
    private BigDecimal total;
    @Schema(description = "Status atual do pedido", example = "PENDENTE")
    private StatusPedido status;
    @Schema(description = "Data e hora em que o pedido foi realizado", example = "2023-10-05T14:30:00")
    private LocalDateTime dataPedido;
    @Schema(description = "Lista de itens incluídos no pedido")
    private List<ItemPedidoResponse> itens;
}
