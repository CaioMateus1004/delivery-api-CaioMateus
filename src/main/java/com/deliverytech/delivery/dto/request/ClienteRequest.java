package com.deliverytech.delivery.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Request para criação ou atualização de cliente")
public class ClienteRequest {
    @NotBlank
    @Schema(description = "Nome do cliente", 
    example = "João Silva")
    private String nome;

    @Email
    @NotBlank
    @Schema(description = "Email do cliente", 
    example = "teste.teste@exemplo.com")
    private String email;
}