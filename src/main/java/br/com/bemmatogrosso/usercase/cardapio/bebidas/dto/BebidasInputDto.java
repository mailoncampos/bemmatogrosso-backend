package br.com.bemmatogrosso.usercase.cardapio.bebidas.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BebidasInputDto {

	private String nome;

	private BigDecimal preco;

	private String categoria;

	private String tipo;

}
