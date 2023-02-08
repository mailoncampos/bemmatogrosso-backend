package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.massas;

import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Tempero;
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
@Table(name = "temperos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TemperoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	public List<TemperoModel> criarListaDeTemperoModel(List<Tempero> temperos){
    	
    	List<TemperoModel> temperoModel = new ArrayList<>();
    	
    	temperos.stream().forEach((tempero) -> temperoModel.add(new TemperoModel(null, tempero.getTempero(), tempero.getDescricaoTempero())));
    	
    	return temperoModel;
    }

}
