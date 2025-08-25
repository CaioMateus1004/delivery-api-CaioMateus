package com.deliverytech.delivery.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deliverytech.delivery.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByEmail(String email);
    
}
