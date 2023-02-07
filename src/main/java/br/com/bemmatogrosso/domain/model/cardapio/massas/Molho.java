package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.MassasExceptionsMessage;
import lombok.Getter;

@Getter
public class Molho {
	
	private String molho;
	
	private String descricaoMolho;
	
	public Molho criar(String molho, String descricaoMolho) {
		this.verificaMolhoIsNotNull(molho).verificaDescricaoMolhoIsNotNull(descricaoMolho);
		return this;
	}

	private Molho verificaMolhoIsNotNull(String molho) {
		if (molho == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.MOLHO_NULO);
		}
		this.setMolho(molho);
		return this;
	}

	private Molho verificaDescricaoMolhoIsNotNull(String descricaoMolho) {
		if (descricaoMolho == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.DESCRICAO_MOLHO_NULO);
		}
		this.setDescricaoMolho(descricaoMolho);
		return this;
	}

	private void setMolho(String molho) {
		this.molho = molho;
	}
	
	private void setDescricaoMolho(String descricaoMolho) {
		this.descricaoMolho = descricaoMolho;
	}
}
