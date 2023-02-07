package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.MassasExceptionsMessage;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Adicional {
	
	private String adicional;

	private String descricaoAdicional;

	public Adicional criar(String adicional, String descricaoAdicional) {
		this.verificaAdicionalIsNotNull(adicional).verificaDescricaoAdicionalIsNotNull(descricaoAdicional);
		return this;
	}

	private Adicional verificaAdicionalIsNotNull(String adicional) {
		if (adicional == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.ADICIONAL_NULO);
		}
		this.setAdicional(adicional);
		return this;
	}

	private Adicional verificaDescricaoAdicionalIsNotNull(String descricaoAdicional) {
		if (descricaoAdicional == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.DESCRICAO_ADICIONAL_NULO);
		}
		this.setDescricaoAdicional(descricaoAdicional);
		return this;
	}

	private void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	private void setDescricaoAdicional(String descricaoAdicional) {
		this.descricaoAdicional = descricaoAdicional;
	}

}
