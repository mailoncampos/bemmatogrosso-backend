package br.com.bemmatogrosso.infra.controller.presenters.dto;

import java.math.BigDecimal;

import br.com.bemmatogrosso.usercase.cardapio.bebidas.BebidasInputDto;
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

	private TipoDto tipoDto;

	private CategoriaDto categoriaDto;

	public BebidasInputDto toBebidasInputDto() {

		BebidasInputDto bebidasInputDto = new BebidasInputDto(nome, preco,
				new CategoriaInputDto(this.categoriaDto.getNome()), new TipoInputDto(this.tipoDto.getNome()));
		
		return bebidasInputDto;

	}

}
