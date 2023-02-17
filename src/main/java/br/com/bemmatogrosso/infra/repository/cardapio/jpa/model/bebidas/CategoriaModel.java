package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.bebidas;

import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Categoria;
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
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "descricao", nullable = false)
	private String descricao;

	public List<Categoria> categoriasModelToCategorias(List<CategoriaModel> categoriasModel) {
		List<Categoria> categorias = new ArrayList<>();

		categoriasModel.stream().forEach((categoriaModel) -> {
			categorias.add(new Categoria().criar(categoriaModel.getNome(), categoriaModel.getDescricao()));
		});

		return categorias;
	}

}
