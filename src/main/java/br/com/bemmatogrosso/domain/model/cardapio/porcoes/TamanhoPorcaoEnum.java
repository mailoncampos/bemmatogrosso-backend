package br.com.bemmatogrosso.domain.model.cardapio.porcoes;

import lombok.Getter;

public enum TamanhoPorcaoEnum {
	INTEIRA("Inteira"),
	MEIA("Meia");
	
	@Getter
	private String descricao;
	
	private TamanhoPorcaoEnum(String descricao) {
		this.descricao = descricao;
	}
}
