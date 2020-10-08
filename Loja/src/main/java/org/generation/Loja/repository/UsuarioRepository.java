package org.generation.Loja.repository;

import java.util.List;

import org.generation.Loja.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

}
