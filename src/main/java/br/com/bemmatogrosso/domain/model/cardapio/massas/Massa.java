package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import lombok.Getter;

@Getter
public class Massa {

	private Nome nome;
	
	public Massa(String nome) {
		this.nome = new Nome(nome);
	}

}
