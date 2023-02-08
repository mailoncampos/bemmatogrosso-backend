package br.com.bemmatogrosso.usercase.cardapio.massas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Massas;
import br.com.bemmatogrosso.domain.model.cardapio.massas.MassasBuilder;
import br.com.bemmatogrosso.domain.model.cardapio.massas.MassasRespository;
import br.com.bemmatogrosso.usercase.cardapio.massas.dto.MassasInputDto;
import br.com.bemmatogrosso.usercase.cardapio.massas.dto.MassasOutputDto;

@Service
public class CriarMassasUserCase {

	@Autowired
	private MassasRespository massasRespository;

	public MassasOutputDto executa(MassasInputDto massasInputDto) {

		Massas massas = new MassasBuilder().comNome(massasInputDto.getNome()).comPreco(massasInputDto.getPreco())
				.comTempoDePreparo(massasInputDto.getTempoDePreparo()).build();

		this.massasRespository.criar(massas);

		return null;
	}

}
