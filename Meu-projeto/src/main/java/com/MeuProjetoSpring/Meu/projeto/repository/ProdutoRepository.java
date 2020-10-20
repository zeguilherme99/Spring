package com.MeuProjetoSpring.Meu.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MeuProjetoSpring.Meu.projeto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase(String produto);

}
