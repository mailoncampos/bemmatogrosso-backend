package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.bebidas;

import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Tipo;
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
@Table(name = "tipo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TipoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	public List<Tipo> tiposModelToTipos(List<TipoModel> tiposModel){
		List<Tipo> tipos = new ArrayList<>();
		
		tiposModel.stream().forEach((tipoModel) -> {
			tipos.add(new Tipo().criar(tipoModel.getNome(), tipoModel.getDescricao()));
		});
		
		return tipos;
	}

}
