package br.com.bemmatogrosso.infra.controller.presenters.request;

import java.math.BigDecimal;
import java.time.Duration;

import br.com.bemmatogrosso.usercase.cardapio.massas.dto.MassasInputDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CriarMassasDto {

	private String nome;

	private Duration tempoDePreparo;

	private BigDecimal preco;

	public MassasInputDto toMassasInputDtos() {

		MassasInputDto massasInputDto = new MassasInputDto().criarMassas(nome, tempoDePreparo, preco);

		return massasInputDto;

	}

}
