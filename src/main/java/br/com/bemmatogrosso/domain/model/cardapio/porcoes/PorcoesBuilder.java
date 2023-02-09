package br.com.bemmatogrosso.domain.model.cardapio.porcoes;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import br.com.bemmatogrosso.domain.exceptions.BebidasExceptionsMessage;
import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.PorcoesExceptionsMessage;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Peso;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import br.com.bemmatogrosso.domain.model.cardapio.vo.TempoPreparo;
import lombok.Getter;

@Getter
public class PorcoesBuilder {

	private Nome nome;

	private Peso peso;

	private TempoPreparo tempoDePreparo;

	private Preco preco;

	private TamanhoPorcaoEnum tamanhoPorcao;

	private List<Acompanhamento> acompanhamentos;

	public PorcoesBuilder comNome(String nome) {
		this.nome = new Nome(nome);
		return this;
	}

	public PorcoesBuilder comPreco(BigDecimal preco) {
		this.preco = new Preco(preco);
		return this;
	}

	public PorcoesBuilder comPeso(double peso) {
		this.peso = new Peso(peso);
		return this;
	}

	public PorcoesBuilder comTempoPreparo(Duration tempoDePreparo) {
		this.tempoDePreparo = new TempoPreparo(tempoDePreparo);
		return this;
	}

	public PorcoesBuilder informarTamanhoPorcao(String tamanhoPorcao) {
		if (tamanhoPorcao.isEmpty()) {
			throw new CardapioExceptions(PorcoesExceptionsMessage.TAMANHO_PORCAO_NULO);
		}
		this.tamanhoPorcao = TamanhoPorcaoEnum.valueOf(tamanhoPorcao);
		return this;
	}

	public Porcoes build() {
		return new Porcoes(this);
	}

}
