package br.com.bemmatogrosso.infra.repository.cardapio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.BebidasRepository;
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
	public void buscarPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

}