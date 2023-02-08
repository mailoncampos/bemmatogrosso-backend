package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.massas;

import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Massa;
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
@Table(name = "tipo_massa")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MassaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	public List<MassaModel> criarListaDeMassaModel(List<Massa> massas){
    	
    	List<MassaModel> massaModel = new ArrayList<>();
    	
    	massas.stream().forEach((massa) -> massaModel.add(new MassaModel(null, massa.getMassa(), massa.getDescricaoMassa())));
    	
    	return massaModel;
    }

}
