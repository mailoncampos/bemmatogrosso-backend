package br.com.bemmatogrosso.infra.repository.cardapio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Categoria;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Tipo;
import br.com.bemmatogrosso.domain.model.cardapio.bebidas.repository.BebidasRepository;
import br.com.bemmatogrosso.infra.repository.cardapio.jpa.BebidasJpaRepository;
import br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.bebidas.BebidasModel;

@Component
public class BedidasJpaRepositoryImpl implements BebidasRepository{
	
	@Autowired
	private BebidasJpaRepository bebidasJpaRepository;

	@Override
	public void criar(Object object) {
		this.bebidasJpaRepository.save(new BebidasModel(object));
	}

	@Override
	public void editar(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarTipo(Tipo tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> T buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
