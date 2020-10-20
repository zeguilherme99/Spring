package com.MeuProjetoSpring.Meu.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MeuProjetoSpring.Meu.projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);

}
