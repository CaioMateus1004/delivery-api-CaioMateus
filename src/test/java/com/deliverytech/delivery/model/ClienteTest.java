package com.deliverytech.delivery.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    
    @Test
    void clienteComNomeValidoDeveRetornarTrue(){
        Cliente cliente = new Cliente();
            cliente.setNome("Marcos");
            assertTrue(cliente.isValido());
    }

    @Test
    void clienteComNomeVazioDeveRetornarFalse(){
        Cliente cliente = new Cliente();
            cliente.setNome("");
            assertFalse(cliente.isValido());
    }

    @Test
    void clienteComNomeNuloDeveRetornarFalse(){
        Cliente cliente = new Cliente();
            cliente.setNome(null);
            assertFalse(cliente.isValido());
    }

    @Test
    void clienteComNomeApenasEspacosDeveRetornarFalse(){
        Cliente cliente = new Cliente();
            cliente.setNome("   ");
            assertFalse(cliente.isValido());
    }

    @Test
    void deveSetarEObterValoresCorretamente() {


        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("João Silva");
        cliente.setEmail("joao@teste.com");
        cliente.setAtivo(true);
        
        assertEquals(1L, cliente.getId());
        assertEquals("João Silva", cliente.getNome());
        assertEquals("joao@teste.com", cliente.getEmail());
        assertTrue(cliente.getAtivo());
        assertTrue(cliente.getDataCriacao() != null);
    }
}
