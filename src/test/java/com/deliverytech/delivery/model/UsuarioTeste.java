package com.deliverytech.delivery.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class UsuarioTest {
//Nome    
    @Test
    void UsuarioComNomeValidoDeveRetornarTrue(){
        Usuario usuario = new Usuario();
            usuario.setNome("Caio");
            assertTrue(usuario.isValido());
    }
    @Test
    void UsuarioComNomeNuloDeveRetornarFalse(){
        Usuario usuario = new Usuario();
            usuario.setNome(null);
    }
    @Test
    void UsuarioComNomeApenasEspacosDeveRetornarFalse(){
        Usuario usuario = new Usuario();
            usuario.setNome("   ");
    }
    @Test
    void UsuarioComNomeVazioDeveRetornarFalse(){
        Usuario usuario = new Usuario();
            usuario.setNome("");
    }
    
    @Test
    void deveSetarEObterValoresCorretamente() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("Caio Paiva");
        usuario.setEmail("caio@teste.com");
        usuario.setAtivo(true);

        assertEquals(1L, usuario.getId());
        assertEquals("Caio Paiva", usuario.getNome());
        assertEquals("caio@teste.com", usuario.getEmail());
        assertTrue(usuario.getAtivo());
        assertTrue(usuario.getDataCriacao() != null);
    }    


}
