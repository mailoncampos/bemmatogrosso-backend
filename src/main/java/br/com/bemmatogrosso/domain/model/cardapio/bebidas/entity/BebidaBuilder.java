package br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity;

import java.math.BigDecimal;
import java.util.Base64;

import br.com.bemmatogrosso.domain.exceptions.BebidasExceptionsMessage;
import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import lombok.Getter;

@Getter
public class BebidaBuilder {

	private Nome nome;

	private Categoria categoria;

	private Preco preco;

	private Tipo tipo;
	
	private byte[] imagem;

	public BebidaBuilder comNome(String nome) {
		this.nome = new Nome(nome);
		return this;
	}
	
	public BebidaBuilder comImagem(String imagemBase64) {
		this.imagem = Base64.getDecoder().decode(imagemBase64);
		return this;
	}

	public BebidaBuilder comPreco(BigDecimal preco) {
		this.preco = new Preco(preco);
		return this;
	}

	public BebidaBuilder comTipo(Tipo tipo) {
		if (tipo == null) {
			throw new CardapioExceptions(BebidasExceptionsMessage.TIPO_NULO);
		}
		this.tipo = tipo;
		return this;
	}

	public BebidaBuilder comCategoria(Categoria categoria) {
		if (categoria == null) {
			throw new CardapioExceptions(BebidasExceptionsMessage.CATEGORIA_NULA);
		}
		this.categoria = categoria;
		return this;
	}

	public Bebida build() {
		return new Bebida(this);
	}

}
