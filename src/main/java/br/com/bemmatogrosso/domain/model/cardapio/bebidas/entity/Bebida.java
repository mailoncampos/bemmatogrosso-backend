package br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import lombok.Getter;

@Getter
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
}
