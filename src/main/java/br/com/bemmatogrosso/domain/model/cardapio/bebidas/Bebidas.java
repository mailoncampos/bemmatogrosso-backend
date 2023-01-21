package br.com.bemmatogrosso.domain.model.cardapio.bebidas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "bebidas", schema = "default")
public class Bebidas {
	
	@Id
	@Column
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private Categoria categoria;
	
	@Column
	private double preco;
	
	@Column
	private Tipo tipo;
	

}
