package org.generation.Loja.repository;

import java.util.List;

import org.generation.Loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByMarcaContainingIgnoreCase(String marca);

}
