package com.deliverytech.delivery.dto.response;

import lombok.*;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteResponse {
    @Schema(description = "Identificador unico do restaurante", example = "1")
    private Long id;

    @Schema(description = "Nome do restaurante", example = "Restaurante do zé e cia")
    private String nome;

    @Schema(description = "Categoria do restaurante", example = "pizzaria")
    private String categoria;

    @Schema(description = "Telefone do restaurante", example = "99 6666-6666")
    private String telefone;

    @Schema(description = "Taxa de entrega em Reais (R$)", example = "5.00")
    private BigDecimal taxaEntrega;

    @Schema(description = "Tempo estimado de entrega em minutos", example = "30")
    private Integer tempoEntregaMinutos;

    @Schema(description = "Disponibilidade do restaurante", example = "true")
    private Boolean ativo;
}
