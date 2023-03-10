package br.com.bemmatogrosso.usercase.cardapio.massas.dto;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import lombok.Getter;

@Getter
public class MassasInputDto {
	
	private String nome;
	
	private Duration tempoDePreparo;
	
	private BigDecimal preco;
	
	private List<String> nomesMolhos;
	
	private List<String> nomesTemperos;

	private List<String> nomesAdicionais;
	
	private List<String> nomesMassas;
	
	public MassasInputDto criarMassas(String nome, Duration tempoDePreparo ,BigDecimal preco) {
		this.nome = nome;
		this.tempoDePreparo = tempoDePreparo;
		this.preco = preco;
		return this;
	}

}
