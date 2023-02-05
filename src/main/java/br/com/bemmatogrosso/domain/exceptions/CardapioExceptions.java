package br.com.bemmatogrosso.domain.exceptions;

import br.com.bemmatogrosso.domain.shared.exceptions.BemMatoGrossoExceptions;

public class CardapioExceptions extends BemMatoGrossoExceptions{

	private static final long serialVersionUID = 2010027072918897555L;
	
	public CardapioExceptions(String menssagem, Throwable causa) {
		super(menssagem, causa);
	}
	
	public CardapioExceptions(String menssagem) {
		super(menssagem);
	}

}
