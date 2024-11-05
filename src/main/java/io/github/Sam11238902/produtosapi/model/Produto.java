package io.github.Sam11238902.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//MAPEAMENTO BASICO ABAIXO.
//OBS @TABLE NAO É OBRIGADO COM O NOME DA ENTIDADE É O MESMO NOME DA TABELA .

@Entity
@Table(name ="produto")
public class Produto {
	//OBS O COLUMN NAO É OBRIGADO A COLOCAR SE O NOME DO ATRIBUTO FOR O MESMO DA COLUNA NO BANCO DE DADOS .
	
	//exemplo abaixo o id esta na coluna de "codigo" no banco de dados .

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "preco")
	private Double preco;
	
	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
