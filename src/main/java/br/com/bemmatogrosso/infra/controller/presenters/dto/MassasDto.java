package br.com.bemmatogrosso.infra.controller.presenters.dto;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class MassasDto {
	
	private String nome;
	
	private Duration tempoDePreparo;
	
	private BigDecimal preco;
	
	private List<MassaDto> massas;

	private List<MolhoDto> molhos;
	
	private List<TemperoDto> temperos;
	
	private List<AdicionalDto> adicionais;
	
}
