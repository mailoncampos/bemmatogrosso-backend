package br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity;

import java.math.BigDecimal;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import lombok.Getter;

@Getter
public class Bebida {
	
	private Nome nome;
	
	private Categoria categoria;
	
	private Preco preco;
	
	private Tipo tipo;

	public Bebida(String nome, Categoria categoria, Preco preco, Tipo tipo) {
		super();
		
		this.nome = new Nome(nome);
		
		this.categoria = categoria;
		this.preco = preco;
		this.tipo = tipo;
	}
	
	public adicionar(String nome, BigDecimal preco) {
		
	}
	
	
	
}
