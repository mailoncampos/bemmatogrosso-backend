package br.com.bemmatogrosso.domain.model.cardapio.bebidas;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import lombok.Getter;

@Getter
public class Bebida {
	
	private String nome;
	
	private Categoria categoria;
	
	private Preco preco;
	
	private Tipo tipo;
	
}
