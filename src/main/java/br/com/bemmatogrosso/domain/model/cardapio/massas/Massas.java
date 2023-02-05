package br.com.bemmatogrosso.domain.model.cardapio.massas;

import java.time.LocalTime;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.vo.TempoPreparo;
import lombok.Getter;

@Getter
public class Massas {
	
	private String nome;
	
	private TempoPreparo tempoDePreparo;
	
	private List<Molho> molhos;
	
	private List<Tempero> temperos;

	private List<Adicional> adicionais;
	
	private List<Massa> massas;
	
	private double preco;
	
	public Massas(String nome, LocalTime tempoDePreparo, List<Molho> molhos, List<Tempero> temperos,
			List<Adicional> adicionais, List<Massa> massas, double preco) {
		super();
		this.nome = nome;
		this.tempoDePreparo = new TempoPreparo(tempoDePreparo);
		this.molhos = molhos;
		this.temperos = temperos;
		this.adicionais = adicionais;
		this.massas = massas;
		this.preco = preco;
	}
	
	
	public Massas adicionar() {
			
		return this;
	}

	

}
