package com.deliverytech.delivery.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Resposta com os dados do cliente", example = "{\"Id\":42,\"nome\":\"João Silva\",\"email\":\"Silva.Joao@teste.com\",\"ativo\":true}")
public class ClienteResponse {
    @Schema(description = "ID do cliente", example = "1")
    private Long id;
    @Schema(description = "Nome do cliente", example = "João Silva")
    private String nome;
    @Schema(description = "Email do cliente", example = "teste.teste@exemplo.com")
    private String email;
    @Schema(description = "Verifica se cliente está ativo", example = "true")
    private Boolean ativo;
}
