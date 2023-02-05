package br.com.bemmatogrosso.domain.model.cardapio.massas;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.MassasExceptionsMessage;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.TempoPreparo;
import lombok.Getter;

@Getter
public class Massas {
	
	private Nome nome;
	
	private TempoPreparo tempoDePreparo;
	
	private List<Molho> molhos;
	
	private List<Tempero> temperos;

	private List<Adicional> adicionais;
	
	private List<Massa> massas;
	
	private BigDecimal preco;
	
	public Massas(String nome, Duration tempoDePreparo, List<Molho> molhos, List<Tempero> temperos,
			List<Adicional> adicionais, List<Massa> massas, BigDecimal preco) {
		super();
		this.nome = new Nome(nome);
		this.tempoDePreparo = new TempoPreparo(tempoDePreparo);
		
		this.molhos = molhos;
		this.temperos = temperos;
		this.adicionais = adicionais;
		this.massas = massas;
		this.preco = preco;
	}
	
	
	public void adicionar(Massa massa) {
		if(massa == null) {
			throw new CardapioExceptions(MassasExceptionsMessage.ADICIONAR_MASSA_NULA);
		}
		this.massas.add(massa);
	}
	
	public void adicionarMassa() {
		
	}

	

}
