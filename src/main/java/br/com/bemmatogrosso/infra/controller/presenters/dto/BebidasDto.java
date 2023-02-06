package br.com.bemmatogrosso.infra.controller.presenters.dto;

import java.math.BigDecimal;

import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.BebidasInputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.CategoriaInputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.TipoInputDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BebidasDto {

	private String nome;

	private BigDecimal preco;

	private TipoDto tipo;

	private CategoriaDto categoria;

	public BebidasInputDto toBebidasInputDto() {

		BebidasInputDto bebidasInputDto = new BebidasInputDto(nome, preco,
				new CategoriaInputDto(this.categoria.getNome()), new TipoInputDto(this.tipo.getNome()));
		
		return bebidasInputDto;

	}

}
