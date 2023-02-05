package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model;

import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Adicional;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "adicional_massas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AdicionalModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	public List<AdicionalModel> criarListaDeAdicionalModel(List<Adicional> adicionais){
    	
    	List<AdicionalModel> adicionaisModel = new ArrayList<>();
    	
    	adicionais.stream().forEach((adicional) -> adicionaisModel.add(new AdicionalModel(null, adicional.getNome().getNome())));
    	
    	return adicionaisModel;
    }
}
