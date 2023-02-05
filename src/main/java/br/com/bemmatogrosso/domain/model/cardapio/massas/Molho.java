package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import lombok.Getter;

@Getter
public class Molho {
	
	private Nome nome;
	
	public Molho(String nome) {
		this.nome = new Nome(nome);
	}

}
