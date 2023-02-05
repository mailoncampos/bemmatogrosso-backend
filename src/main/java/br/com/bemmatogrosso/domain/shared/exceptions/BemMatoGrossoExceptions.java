package br.com.bemmatogrosso.domain.shared.exceptions;

public class BemMatoGrossoExceptions extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public BemMatoGrossoExceptions(String menssagem) {
        super(menssagem);
    }

    public BemMatoGrossoExceptions(String menssagem, Throwable causa) {
        super(menssagem, causa);
    }

}
