package com.deliverytech.delivery.controller;

import com.deliverytech.delivery.dto.request.ClienteRequest;
import com.deliverytech.delivery.dto.response.ClienteResponse;
import com.deliverytech.delivery.model.Cliente;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.deliverytech.delivery.Service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Tag(name = "Clientes", description = "Endpoint de clientes")
@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

        private final ClienteService clienteService;

        @PostMapping
        @Operation(summary = "Cadastra um Cliente")
        public ResponseEntity<ClienteResponse> cadastrar(@Valid @RequestBody ClienteRequest request) {
                Cliente cliente = Cliente.builder()
                                .nome(request.getNome())
                                .email(request.getEmail())
                                .ativo(true)
                                .build();
                Cliente salvo = clienteService.cadastrar(cliente);
                return ResponseEntity
                                .ok(new ClienteResponse(salvo.getId(), salvo.getNome(), salvo.getEmail(),
                                                salvo.getAtivo()));
        }

        @GetMapping
        @Operation(summary = "Lista todos os Clientes ativos", description = "Retorna uma lista de clientes que estão ativos no sistema")
        public List<ClienteResponse> listar() {
                return clienteService.listarAtivos().stream()
                                .map(c -> new ClienteResponse(c.getId(), c.getNome(), c.getEmail(), c.getAtivo()))
                                .collect(Collectors.toList());
        }

        @GetMapping("/{id}")
        @Operation(summary = "Busca um Cliente por ID", description = "Retorna os detalhes de um cliente específico a partir do seu ID")
        public ResponseEntity<ClienteResponse> buscar(@PathVariable Long id) {
                return clienteService.buscarPorId(id)
                                .map(c -> new ClienteResponse(c.getId(), c.getNome(), c.getEmail(), c.getAtivo()))
                                .map(ResponseEntity::ok)
                                .orElse(ResponseEntity.notFound().build());
        }

        @PutMapping("/{id}")
        @Operation(summary = "Atualiza um Cliente", description = "Atualiza os dados de um cliente existente a partir do seu ID")
        public ResponseEntity<ClienteResponse> atualizar(@PathVariable Long id,
                        @Valid @RequestBody ClienteRequest request) {
                Cliente atualizado = Cliente.builder()
                                .nome(request.getNome())
                                .email(request.getEmail())
                                .build();
                Cliente salvo = clienteService.atualizar(id, atualizado);
                return ResponseEntity
                                .ok(new ClienteResponse(salvo.getId(), salvo.getNome(), salvo.getEmail(),
                                                salvo.getAtivo()));
        }

        @PatchMapping("/{id}/status")
        @Operation(summary = "Ativa ou Desativa um Cliente", description = "Alterna o status ativo/inativo de um cliente a partir do seu ID")
        public ResponseEntity<Void> ativarDesativar(@PathVariable Long id) {
                clienteService.ativarDesativar(id);
                return ResponseEntity.noContent().build();
        }
}
