package br.com.bemmatogrosso.usercase.cardapio.bebidas.dto;

import java.util.List;
import java.util.Map;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Categoria;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Tipo;
import lombok.Getter;

@Getter
public class InformacesCadastroBebidasOutputDto {

	private Map<String, String> tipoBebida;

	private Map<String, String> categoriaBebida;

	public InformacesCadastroBebidasOutputDto(List<Tipo> tipos, List<Categoria> categorias) {
		tipos.stream().forEach((tipo) -> {
			this.tipoBebida.put(tipo.getTipo(), tipo.getDescricaoTipo());
		});

		categorias.stream().forEach((categoria) -> {
			this.categoriaBebida.put(categoria.getCategoria(), categoria.getDescricaoCategoria());
		});
	}

}
