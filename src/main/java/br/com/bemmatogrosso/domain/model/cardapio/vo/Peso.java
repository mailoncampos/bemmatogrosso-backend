package br.com.bemmatogrosso.domain.model.cardapio.vo;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.PesoExceptionsMessage;
import lombok.Getter;

@Getter
public class Peso {
	
	private double peso;
	
	public Peso(double peso) {
		this.pesoDiferenteNull(peso).verificaPesoNegativo();
	}
	
	private Peso pesoDiferenteNull(double peso) {
		if (peso == Double.NaN) {
			throw new CardapioExceptions(PesoExceptionsMessage.PRECO_NULO);
		}
		this.peso = peso;
		return this;
	}

	private Peso verificaPesoNegativo() {
		if ((this.peso) < 0) {
			throw new CardapioExceptions(PesoExceptionsMessage.PESO_MENOR_ZERO);
		}
		return this;
	}

}
