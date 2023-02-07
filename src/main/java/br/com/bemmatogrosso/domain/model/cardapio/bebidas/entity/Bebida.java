package br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity;

import java.math.BigDecimal;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;

public class Bebida {

	private Nome nome;

	private Categoria categoria;

	private Preco preco;

	private Tipo tipo;

	protected Bebida(BebidaBuilder builder) {
		this.nome = builder.getNome();
		this.preco = builder.getPreco();
		this.tipo = builder.getTipo();
		this.categoria = builder.getCategoria();
	}
	
	public String getNome() {
		return this.nome.getNome();
	}
	
	public BigDecimal getPreco() {
		return this.preco.getPreco();
	}
	
	public String getTipo() {
		return this.tipo.getTipo();
	}
	
	public String getCategoria() {
		return this.categoria.getCategoria();
	}
	
	public String getDescricaoTipo() {
		return this.tipo.getDescricaoTipo();
	}
	
	public String getDescricaoCategoria() {
		return this.categoria.getDescricaoCategoria();
	}
}
