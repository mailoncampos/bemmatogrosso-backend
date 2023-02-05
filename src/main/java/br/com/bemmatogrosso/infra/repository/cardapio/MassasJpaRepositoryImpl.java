package br.com.bemmatogrosso.infra.repository.cardapio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.bemmatogrosso.domain.model.cardapio.massas.MassasRespository;
import br.com.bemmatogrosso.infra.repository.cardapio.jpa.MassasJpaRepository;
import br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.MassasModel;

@Component
public class MassasJpaRepositoryImpl implements MassasRespository{
	
	@Autowired
	private MassasJpaRepository massasJpaRepository;

	@Override
	public void criar(Object object) {
		this.massasJpaRepository.save(new MassasModel(object));
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
