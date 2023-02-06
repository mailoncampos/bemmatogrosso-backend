package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.bebidas;

import java.math.BigDecimal;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Bebida;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bebida")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BebidasModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "preco", nullable = false)
	private BigDecimal preco;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "categoria_id")
	private CategoriaModel categoria;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "tipo_id")
	private TipoModel tipo;

	public BebidasModel(Object object) {

		Bebida bebida = (Bebida) object;

		this.nome = bebida.getNome().getNome();
		this.preco = bebida.getPreco().getPreco();
		this.categoria = new CategoriaModel(null, bebida.getCategoria().getNome().getNome());
		this.tipo = new TipoModel(null, bebida.getTipo().getNome().getNome());

	}

}
