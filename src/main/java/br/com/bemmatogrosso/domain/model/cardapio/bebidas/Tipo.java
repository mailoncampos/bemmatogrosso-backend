package br.com.bemmatogrosso.domain.model.cardapio.bebidas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import lombok.Getter;

@Getter
public class Tipo {

	private Nome nome;

	public Tipo(String nome) {
		this.nome = new Nome(nome);
	}

}
