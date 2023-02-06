package br.com.bemmatogrosso.infra.repository.cardapio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.bebidas.BebidasModel;

@Repository(value = "BebidasJpaRepository")
public interface BebidasJpaRepository extends JpaRepository<BebidasModel, Long>{

}
