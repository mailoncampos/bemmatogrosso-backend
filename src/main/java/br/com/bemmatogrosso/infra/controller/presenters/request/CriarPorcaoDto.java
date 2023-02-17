package br.com.bemmatogrosso.infra.controller.presenters.request;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import br.com.bemmatogrosso.usercase.cardapio.porcoes.PorcoesInputDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CriarPorcaoDto {

	private String nome;

	private int peso;

	private Duration tempoPreparo;

	private BigDecimal preco;

	private String tipo;

	private String imagem;

	private List<Long> idAcompanhamentos;

	public PorcoesInputDto toPorcaoInputDto() {
		return new PorcoesInputDto(nome, peso, tempoPreparo, preco, tipo, imagem, idAcompanhamentos);
	}

}
