package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.MassasExceptionsMessage;
import lombok.Getter;

@Getter
public class Massa {

	private String massa;

	private String descricaoMassa;

	public Massa criar(String massa, String descricaoMassa) {
		this.verificaMassaIsNotNull(massa).verificaDescricaoMassaIsNotNull(descricaoMassa);
		return this;
	}

	private Massa verificaMassaIsNotNull(String massa) {
		if (massa == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.MASSA_NULA);
		}
		this.setMassa(massa);
		return this;
	}

	private Massa verificaDescricaoMassaIsNotNull(String descricaoMassa) {
		if (descricaoMassa == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.DESCRICAO_MASSA_NULA);
		}
		this.setDescricaoMassa(descricaoMassa);
		return this;
	}

	private void setMassa(String massa) {
		this.massa = massa;
	}

	private void setDescricaoMassa(String descricaoMassa) {
		this.descricaoMassa = descricaoMassa;
	}

}
