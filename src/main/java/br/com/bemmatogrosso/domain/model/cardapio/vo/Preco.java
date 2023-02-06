package br.com.bemmatogrosso.domain.model.cardapio.vo;

import java.math.BigDecimal;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.PrecoExceptionsMessage;
import lombok.Getter;

@Getter
public class Preco {

	private BigDecimal preco;

	public Preco(BigDecimal preco) {	
		
		this.precoDiferenteNull(preco).verificaPrecoNegativo();
		
	}

	private Preco precoDiferenteNull(BigDecimal preco) {
		if (preco == null) {
			throw new CardapioExceptions(PrecoExceptionsMessage.PRECO_NULO);
		}
		this.preco = preco;
		return this;
	}

	private Preco verificaPrecoNegativo() {
		if (this.preco.compareTo(BigDecimal.ZERO) < 0) {
			throw new CardapioExceptions(PrecoExceptionsMessage.PRECO_NEGATIVO);
		}
		return this;
	}

}
