package br.com.bemmatogrosso.usercase.cardapio.massas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Adicional;
import br.com.bemmatogrosso.domain.model.cardapio.massas.Massa;
import br.com.bemmatogrosso.domain.model.cardapio.massas.Massas;
import br.com.bemmatogrosso.domain.model.cardapio.massas.MassasRespository;
import br.com.bemmatogrosso.domain.model.cardapio.massas.Molho;
import br.com.bemmatogrosso.domain.model.cardapio.massas.Tempero;

@Service
public class CriarMassasUserCase {

	@Autowired
	private MassasRespository massasRespository;

	public MassasOutputDto executa(MassasInputDto massasInputDto) {

		List<Molho> molhos = new ArrayList<>();
		List<Tempero> temperos = new ArrayList<>();
		List<Massa> tiposMassa = new ArrayList<>();
		List<Adicional> adicionais = new ArrayList<>();

		massasInputDto.getNomesMolhos().stream().forEach((molho) -> molhos.add(new Molho(molho)));
		massasInputDto.getNomesTemperos().stream().forEach((tempero) -> temperos.add(new Tempero(tempero)));
		massasInputDto.getNomesMassas().stream().forEach((massa) -> tiposMassa.add(new Massa(massa)));
		massasInputDto.getNomesAdicionais().stream().forEach((adicional) -> adicionais.add(new Adicional(adicional)));

		Massas massas = new Massas(massasInputDto.getNome(), massasInputDto.getTempoDePreparo(), molhos, temperos,
				adicionais, tiposMassa, massasInputDto.getPreco());

		this.massasRespository.criar(massas);

		return new MassasOutputDto(massas.getNome().getNome(), massas.getTempoDePreparo().getTempoDePreparo(),
				massas.getPreco(), massasInputDto.getNomesMolhos(), massasInputDto.getNomesTemperos(),
				massasInputDto.getNomesAdicionais(), massasInputDto.getNomesMassas());
	}

}
