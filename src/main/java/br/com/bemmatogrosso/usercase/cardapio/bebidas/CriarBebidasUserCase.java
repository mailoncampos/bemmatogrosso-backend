package br.com.bemmatogrosso.usercase.cardapio.bebidas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.Bebida;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.BebidasRepository;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.Categoria;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.Tipo;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.BebidasInputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.BebidasOutupDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.CategoriaOutputDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.TipoOutputDto;

@Service
public class CriarBebidasUserCase {

	@Autowired
	private BebidasRepository bebidasRepository;

	public BebidasOutupDto executa(BebidasInputDto bebidasInputDto) {

		Bebida bebida = new Bebida(bebidasInputDto.getNome(), new Categoria(bebidasInputDto.getCateoriaDto().getNome()),
				new Preco(bebidasInputDto.getPreco()), new Tipo(bebidasInputDto.getTipoDto().getNome()));

		this.bebidasRepository.criar(bebida);

		return new BebidasOutupDto(bebidasInputDto.getNome(), bebidasInputDto.getPreco(),
				new CategoriaOutputDto(bebidasInputDto.getCateoriaDto().getNome()),
				new TipoOutputDto(bebidasInputDto.getTipoDto().getNome()));
	}

}
