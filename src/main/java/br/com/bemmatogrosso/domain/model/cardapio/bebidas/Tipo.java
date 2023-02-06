package br.com.bemmatogrosso.domain.model.cardapio.bebidas;

import br.com.bemmatogrosso.domain.exceptions.BebidasExceptionsMessage;
import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import lombok.Getter;

@Getter
public class Tipo {

	private String tipo;

	private String descricaoTipo;

	private Tipo(String tipo) {
		this.tipo = tipo;
	}

	public Tipo criar(String tipo, String descricao) {
		this.verificaTipoIsNotNull(tipo).verificaDescricaoTipoIsNotNull(descricao);
		return this;
	}

	private Tipo verificaTipoIsNotNull(String tipo) {
		if (tipo == null) {
			throw new CardapioExceptions(BebidasExceptionsMessage.TIPO_NULO);
		}
		this.setTipo(tipo);
		return this;
	}

	private Tipo verificaDescricaoTipoIsNotNull(String descricao) {
		if (tipo == null) {
			throw new CardapioExceptions(BebidasExceptionsMessage.DESCRICAO_TIPO_NULO);
		}
		this.setTipo(tipo);
		return this;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
