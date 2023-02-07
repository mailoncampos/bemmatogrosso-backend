package br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity;

import br.com.bemmatogrosso.domain.exceptions.BebidasExceptionsMessage;
import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import lombok.Getter;

@Getter
public class Categoria {

	private String categoria;
	
	private String descricaoCategoria;

	public Categoria criar(String categoria, String descricao) {
		this.verificaCategoriaIsNotNull(categoria).verificaDescricaoCategoriaIsNotNull(descricao);
		return this;
	}

	private Categoria verificaCategoriaIsNotNull(String categoria) {
		if (categoria == null) {
			throw new CardapioExceptions(BebidasExceptionsMessage.CATEGORIA_NULA);
		}
		this.setCategoria(categoria);
		return this;
	}

	private Categoria verificaDescricaoCategoriaIsNotNull(String descricao) {
		if (descricao == null) {
			throw new CardapioExceptions(BebidasExceptionsMessage.DESCRICAO_CATEGORIA_NULA);
		}
		this.setDescricaoCategoria(descricao);
		return this;
	}

	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	private void setDescricaoCategoria(String descricao) {
		this.descricaoCategoria = descricao;
	}

}
