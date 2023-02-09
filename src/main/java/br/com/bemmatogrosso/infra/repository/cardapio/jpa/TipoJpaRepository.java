package br.com.bemmatogrosso.infra.repository.cardapio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.bebidas.TipoModel;

@Repository(value = "TipoJpaRepository")
public interface TipoJpaRepository extends JpaRepository<TipoModel, Long>{

}
