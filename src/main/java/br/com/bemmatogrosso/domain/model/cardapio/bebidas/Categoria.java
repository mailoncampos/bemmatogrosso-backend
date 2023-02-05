package br.com.bemmatogrosso.domain.model.cardapio.bebidas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import lombok.Getter;

@Getter
public class Categoria {

	private Nome nome;

	public Categoria(String nome) {
		this.nome = new Nome(nome);
	}

}
