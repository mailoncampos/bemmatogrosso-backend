package br.com.bemmatogrosso.domain.model.cardapio.porcoes.entity;

import java.math.BigDecimal;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.PorcoesExceptionsMessage;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Acompanhamento {

	private String nomeAcompanhamento;

	private String descricaoAcompanhamento;

	private Preco preco;

	public Acompanhamento criar(String nome, String descricao, BigDecimal preco) {
		this.verificaAcompanhamentoIsNotNull(nome).verificaDescricaoAcompanhamentoIsNotNull(descricao)
				.adicionaPreco(preco);
		return this;
	}

	private Acompanhamento verificaAcompanhamentoIsNotNull(String nome) {
		if (nome == null) {
			throw new CardapioExceptions(PorcoesExceptionsMessage.NOME_ACOMPANHAMENTO_NULO);
		}
		this.setNome(nome);
		return this;
	}

	private Acompanhamento verificaDescricaoAcompanhamentoIsNotNull(String descricao) {
		if (descricao == null) {
			throw new CardapioExceptions(PorcoesExceptionsMessage.DESCRICAO_ACOMPANHAMENTO_NULA);
		}
		this.setDescricaoAcompanhamento(descricao);
		return this;
	}

	private void setNome(String nome) {
		this.nomeAcompanhamento = nome;
	}

	private Acompanhamento adicionaPreco(BigDecimal preco) {
		this.preco = new Preco(preco);
		return this;
	}

	private void setDescricaoAcompanhamento(String descricao) {
		this.descricaoAcompanhamento = descricao;
	}

}
