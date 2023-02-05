package br.com.bemmatogrosso.domain.model.cardapio.vo;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.NomeExceptionsMessage;
import lombok.Getter;

@Getter
public class Nome {
	
	private String nome;
	
	public Nome(String nome) {
		this.nomeDiferenteNull(nome).verificaNomeEmBranco();
	}
	
	private Nome nomeDiferenteNull(String nome) {
		if(nome == null){
			throw new CardapioExceptions(NomeExceptionsMessage.NOME_NULO);
		}
		this.nome = nome;
		return this;
	}
	
	private Nome verificaNomeEmBranco() {
		if(this.nome == ""){
			throw new CardapioExceptions(NomeExceptionsMessage.NOME_EM_BRANCO);
		}
		return this;
	}

}
