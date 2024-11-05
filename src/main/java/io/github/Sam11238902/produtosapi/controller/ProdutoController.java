package io.github.Sam11238902.produtosapi.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.Sam11238902.produtosapi.model.Produto;
import io.github.Sam11238902.produtosapi.repository.ProdutoRepository;

@RestController // informa ao spring que essa classe vai receber requisicoes.
@RequestMapping("/produtos") // request mapping diz qual a url base desse controler, no caso "/produtos" . 
public class ProdutoController {


	@Autowired
	ProdutoRepository produtoRepository;
	
	
	@PostMapping
	public Produto salverProduto(@RequestBody Produto produto) { /// anotacao @RequestBody , significa que o objeto que esta recebendo é o corpo da requisicao
		var id = UUID.randomUUID().toString();
		produto.setId(id);
		produtoRepository.save(produto);
		//System.out.println("Salvando o produto" + produto);
		
		return produto;
	}
	
	@GetMapping("/{id}")
	public Produto obterPorId(@PathVariable("id") String id) {
		
		/*
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.isPresent() ? produto.get() : null;
		*/
		
		return produtoRepository.findById(id).orElse(null);
	}

	
	
	@DeleteMapping("/{id}")
	public void deletarPorId(@PathVariable("id") String id) {		
		produtoRepository.deleteById(id);
		
	}

	
	//metodo vai receber um produto no corpo da requisição e um ID na URl da requisição
	//vai pegar esse objeto produto e setar o ID passado na requisição , depois vai  
	//salvar com os dados do corpo da requisicao.

	@PutMapping("{id}")
	public void atualizarPorId(@PathVariable("id")String id,@RequestBody Produto produto) {	
		produto.setId(id);
		produtoRepository.save(produto);
		
	}

	
	
}
