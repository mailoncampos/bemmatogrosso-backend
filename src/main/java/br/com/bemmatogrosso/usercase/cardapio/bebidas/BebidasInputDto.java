package br.com.bemmatogrosso.usercase.cardapio.bebidas;

import java.math.BigDecimal;

import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.CategoriaInputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.TipoInputDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BebidasInputDto {

	private String nome;

	private BigDecimal preco;

	private CategoriaInputDto cateoriaDto;

	private TipoInputDto tipoDto;

}
