package br.com.bemmatogrosso.domain.model.cardapio.massas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Adicional {
	
	private Nome nome;
	
	public Adicional(String nome) {
		this.nome = new Nome(nome);
	}

}
