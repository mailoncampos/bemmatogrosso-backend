package br.com.bemmatogrosso.infra.controller.presenters.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MassasDto {
	
	private String nome;
	
	private BigDecimal preco;
	
	private List<MassaDto> massas;

	private List<MolhoDto> molhos;
	
	private List<TemperoDto> temperos;
	
	private List<AdicionalDto> adicionais;

}
