package org.generation.Loja.repository;

import java.util.List;

import org.generation.Loja.model.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaRepository extends JpaRepository<Loja, Long>{
	public List<Loja> findAllByNomeContainingIgnoreCase (String nome);

}
