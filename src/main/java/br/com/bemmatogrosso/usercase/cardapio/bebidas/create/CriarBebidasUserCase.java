package br.com.bemmatogrosso.usercase.cardapio.bebidas.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Bebida;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.BebidaBuilder;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Categoria;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Tipo;
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

		Tipo tipo = bebidasRepository.buscaTipo(bebidasInputDto.getTipo());
		Categoria categoria = bebidasRepository.buscarCategoria(bebidasInputDto.getCategoria());
		
		Bebida bebida = new BebidaBuilder().comNome(bebidasInputDto.getNome()).comPreco(bebidasInputDto.getPreco())
				.comCategoria(categoria).comTipo(tipo).build();

		this.bebidasRepository.criar(bebida);

		return new BebidasOutupDto(bebidasInputDto.getNome(), bebidasInputDto.getPreco(),
				new CategoriaOutputDto(categoria.getCategoria()), new TipoOutputDto(tipo.getTipo()));
	}

}
