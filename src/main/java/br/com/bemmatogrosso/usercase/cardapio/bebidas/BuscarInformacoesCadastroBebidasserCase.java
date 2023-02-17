package br.com.bemmatogrosso.usercase.cardapio.bebidas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Categoria;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Tipo;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.repository.BebidasRepository;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.InformacesCadastroBebidasOutputDto;

@Service
public class BuscarInformacoesCadastroBebidasserCase {

	@Autowired
	private BebidasRepository bebidasRepository;
	
	public InformacesCadastroBebidasOutputDto executa() {

		List<Tipo> tipos = this.bebidasRepository.buscaTodosOsTipo();
		List<Categoria> categorias = this.bebidasRepository.buscaTodasAsCategorias();

		return new InformacesCadastroBebidasOutputDto(tipos, categorias);
	}
}
