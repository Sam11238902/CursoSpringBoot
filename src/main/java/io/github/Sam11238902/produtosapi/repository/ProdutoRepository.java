package io.github.Sam11238902.produtosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.Sam11238902.produtosapi.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, String> {

	
	
	List<Produto> findByNome(String nome);
	
	
	
}
