package br.com.bemmatogrosso.domain.model.cardapio.massas;

import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
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

	private Preco preco;

	protected Massas(MassasBuilder builder) {
		this.nome = builder.nome;
		this.tempoDePreparo = builder.tempoDePreparo;
		this.molhos = builder.molhos;
		this.temperos = builder.temperos;
		this.adicionais = builder.adicionais;
		this.massas = builder.massas;
		this.preco = builder.preco;
	}
}
