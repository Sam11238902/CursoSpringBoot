package io.github.Sam11238902.produtosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.Sam11238902.produtosapi.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, String> {

}
