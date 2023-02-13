package br.com.bemmatogrosso.domain.model.cardapio.porcoes.entity;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Peso;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import br.com.bemmatogrosso.domain.model.cardapio.vo.TempoPreparo;

public class Porcoes {

	private Nome nome;
	
	private Peso peso;
	
	private TempoPreparo tempoDePreparo;
	
	private Preco preco;
	
	private TamanhoPorcaoEnum tamanhoPorcao;
	
	private List<Acompanhamento> acompanhamentos;
	
	protected Porcoes(PorcoesBuilder builder) {
		this.nome = builder.getNome();
		this.preco = builder.getPreco();
		this.tempoDePreparo = builder.getTempoDePreparo();
		this.acompanhamentos = builder.getAcompanhamentos();
		this.peso = builder.getPeso();
		this.tamanhoPorcao = builder.getTamanhoPorcao();
	}

	public String getNome() {
		return this.nome.getNome();
	}
	
	public BigDecimal getPreco() {
		return this.preco.getPreco();
	}

	public double getPeso() {
		return peso.getPeso();
	}

	public Duration getTempoDePreparo() {
		return tempoDePreparo.getTempoDePreparo();
	}

	public String getTamanhoPorcao() {
		return tamanhoPorcao.getDescricao();
	}

	public List<Acompanhamento> getAcompanhamentos() {
		return acompanhamentos;
	}
	
	
	
}
