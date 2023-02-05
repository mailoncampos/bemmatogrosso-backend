package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import lombok.Getter;

@Getter
public class Tempero {

	private Nome nome;
	
	public Tempero(String nome) {
		this.nome = new Nome(nome);
	}

}
