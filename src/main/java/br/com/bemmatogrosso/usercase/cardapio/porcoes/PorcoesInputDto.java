package br.com.bemmatogrosso.usercase.cardapio.porcoes;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PorcoesInputDto {
	
	private String nome;

	private BigDecimal preco;

	private String tamanhoPorcao;

	private List<String> nomesAcompanhamento;

}
