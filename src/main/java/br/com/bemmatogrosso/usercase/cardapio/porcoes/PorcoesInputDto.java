package br.com.bemmatogrosso.usercase.cardapio.porcoes;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PorcoesInputDto {
	
	private String nome;
	
	private int peso;

	private Duration tempoPreparo;

	private BigDecimal preco;
	
	private String tipo;
	
	private String imagem;
	
	private List<Long> idAcompanhamentos;

}
