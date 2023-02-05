package br.com.bemmatogrosso.infra.repository.cardapio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.MassasModel;

@Repository(value = "MassasJpaRepository")
public interface MassasJpaRepository extends JpaRepository<MassasModel, Long>{

}
