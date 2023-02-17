package br.com.bemmatogrosso.domain.model.cardapio.bebidas.repository;

import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Categoria;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Tipo;
import br.com.bemmatogrosso.domain.shared.repository.RepositoryBemMatoGrosso;

public interface BebidasRepository extends RepositoryBemMatoGrosso{

	void adicionarTipo(Tipo tipo);
	
	void adicionarCategoria(Categoria categoria);
	
	Tipo buscaTipo(String tipo);
	
	List<Tipo> buscaTodosOsTipo();
	
	Categoria buscarCategoria(String categoria);
		
	List<Categoria> buscaTodasAsCategorias();
}
