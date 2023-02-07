package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.MassasExceptionsMessage;
import lombok.Getter;

@Getter
public class Tempero {

	private String tempero;

	private String descricaoTempero;

	public Tempero criar(String tempero, String descricaoTempero) {
		this.verificaTemperoIsNotNull(tempero).verificaDescricaoTemperoIsNotNull(descricaoTempero);
		return this;
	}

	private Tempero verificaTemperoIsNotNull(String tempero) {
		if (tempero == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.TEMPERO_NULO);
		}
		this.setTempero(tempero);
		return this;
	}

	private Tempero verificaDescricaoTemperoIsNotNull(String descricaoTempero) {
		if (descricaoTempero == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.DESCRICAO_TEMPERO_NULO);
		}
		this.setDescricaoTempero(descricaoTempero);
		return this;
	}

	private void setTempero(String tempero) {
		this.tempero = tempero;
	}

	private void setDescricaoTempero(String descricaoTempero) {
		this.descricaoTempero = descricaoTempero;
	}

}
