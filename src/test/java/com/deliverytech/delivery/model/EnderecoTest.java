package com.deliverytech.delivery.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EnderecoTest {
    
    @Test
    void enderecoComTodosCamposValidosDeveRetornarTrue() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setNumero("123");
        endereco.setBairro("Centro");
        endereco.setCidade("Cidade X");
        endereco.setEstado("Estado Y");
        endereco.setCep("12345-678");

        assertTrue(endereco.isValido());
    }
//Rua
    @Test
    void enderecoComCampoRuaNuloDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setRua(null);
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoRuaVazioDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setRua("");
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoRuaComEspacosDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setRua("   ");
        assertFalse(endereco.isValido());
    }
//numero
    @Test
    void enderecoComCampoNumeroNuloDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setNumero(null);
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoNumeroVazioDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setNumero("");
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoNumeroComEspacosDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setNumero("   ");
        assertFalse(endereco.isValido());
    }
//bairro
    @Test
    void enderecoComCampoBairroNuloDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setBairro(null);
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoBairroVazioDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setBairro("");
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoBairroComEspacosDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setBairro("   ");
        assertFalse(endereco.isValido());
    }
//cidade
    @Test
    void enderecoComCampoCidadeNuloDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setCidade(null);
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoCidadeVazioDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setCidade("");
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoCidadeComEspacosDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setCidade("   ");
        assertFalse(endereco.isValido());
    }
//estado
    @Test
    void enderecoComCampoEstadoNuloDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setEstado(null);
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoEstadoVazioDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setEstado("");
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoEstadoComEspacosDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setEstado("   ");
        assertFalse(endereco.isValido());
    }
//cep
    @Test
    void enderecoComCampoCepNuloDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setCep(null);
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoCepVazioDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setCep("");
        assertFalse(endereco.isValido());
    }
    @Test
    void enderecoComCampoCepComEspacosDeveRetornarFalse() {
        Endereco endereco = new Endereco();
        endereco.setCep("   ");
        assertFalse(endereco.isValido());
    }

    @Test
    void deveSetarEObterValoresCorretamente() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setNumero("123");
        endereco.setBairro("Centro");
        endereco.setCidade("Cidade X");
        endereco.setEstado("Estado Y");
        endereco.setCep("12345-678");

        assertEquals("Rua A", endereco.getRua());
        assertEquals("123", endereco.getNumero());
        assertEquals("Centro", endereco.getBairro());
        assertEquals("Cidade X", endereco.getCidade());
        assertEquals("Estado Y", endereco.getEstado());
        assertEquals("12345-678", endereco.getCep());
    }
}
