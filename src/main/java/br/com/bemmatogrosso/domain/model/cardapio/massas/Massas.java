package br.com.bemmatogrosso.domain.model.cardapio.massas;

import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Massas {
	
	private String nome;
	
	private LocalTime tempoDePreparo;
	
	private List<Molho> molhos;
	
	private List<Tempero> temperos;

	private List<Adicional> adicionais;
	
	private List<Massa> massas;
	
	private double preco;

}
