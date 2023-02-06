package br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity;

import java.math.BigDecimal;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import lombok.Getter;

@Getter
public class BebidaBuilder {
	
	private Nome nome;

	private Categoria categoria;

	private Preco preco;

	private Tipo tipo;

	public BebidaBuilder comNome(String nome) {
		this.nome =new Nome(nome);
		return this;
	}

	public BebidaBuilder comPreco(BigDecimal preco) {
		this.preco =new Preco(preco);
		return this;
	}

	public BebidaBuilder comTipo(String tipo, String descricao) {
		this.tipo = new Tipo().criar(tipo, descricao);
		return this;
	}

	public BebidaBuilder comCategoria(String categoria, String descricao) {
		this.categoria = new Categoria().criar(categoria, descricao);
		return this;
	}

	public Bebida build() {
		return new Bebida(this);
	}

}
