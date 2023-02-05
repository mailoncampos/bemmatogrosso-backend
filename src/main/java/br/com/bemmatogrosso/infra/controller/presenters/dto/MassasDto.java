package br.com.bemmatogrosso.infra.controller.presenters.dto;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.usercase.cardapio.massas.MassasInputDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MassasDto {
	
	private String nome;
	
	private Duration tempoDePreparo;
	
	private BigDecimal preco;
	
	private List<MassaDto> massas;

	private List<MolhoDto> molhos;
	
	private List<TemperoDto> temperos;
	
	private List<AdicionalDto> adicionais;
	
	public MassasInputDto toMassasInputDtos(){
		
		List<String> nomeMassas = new ArrayList<>();
		this.massas.stream().forEach((massa) -> nomeMassas.add(massa.getNome()));
		
		List<String> nomeMolhos = new ArrayList<>();
		this.molhos.stream().forEach((molho) -> nomeMassas.add(molho.getNome()));
		
		List<String> nomeTemperos = new ArrayList<>();
		this.temperos.stream().forEach((tempero) -> nomeMassas.add(tempero.getNome()));
		
		List<String> nomeAdicionais = new ArrayList<>();
		this.adicionais.stream().forEach((adicional) -> nomeMassas.add(adicional.getNome()));
		
		MassasInputDto massasInputDto = new MassasInputDto(this.nome, this.tempoDePreparo ,this.preco, nomeMolhos, nomeTemperos, nomeAdicionais, nomeMassas);
		
		return massasInputDto;
		
	}

}
