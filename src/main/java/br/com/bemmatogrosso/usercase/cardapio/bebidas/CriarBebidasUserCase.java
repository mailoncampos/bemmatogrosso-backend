package br.com.bemmatogrosso.usercase.cardapio.bebidas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Bebida;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.BebidaBuilder;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.repository.BebidasRepository;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.BebidasInputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.BebidasOutupDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.CategoriaOutputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.TipoOutputDto;

@Service
public class CriarBebidasUserCase {

	@Autowired
	private BebidasRepository bebidasRepository;

	public BebidasOutupDto executa(BebidasInputDto bebidasInputDto) {

		Bebida bebida = new BebidaBuilder()
				.comNome(bebidasInputDto.getNome())
				.comPreco(null)
				.comCategoria(bebidasInputDto.getCateoriaDto().getNome(), bebidasInputDto.getCateoriaDto().getDescricao())
				.comTipo(bebidasInputDto.getTipoDto().getNome(), bebidasInputDto.getTipoDto().getDescricao())
				.build();

		this.bebidasRepository.criar(bebida);

		return new BebidasOutupDto(bebidasInputDto.getNome(), bebidasInputDto.getPreco(),
				new CategoriaOutputDto(bebidasInputDto.getCateoriaDto().getNome()),
				new TipoOutputDto(bebidasInputDto.getTipoDto().getNome()));
	}

}
