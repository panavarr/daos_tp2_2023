package com.tsti.accesoADatos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsti.entidades.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{

	Usuario findByUsername(String username);

}
