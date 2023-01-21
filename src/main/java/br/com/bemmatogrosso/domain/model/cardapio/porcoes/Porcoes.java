package br.com.bemmatogrosso.domain.model.cardapio.porcoes;

import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Porcoes {

	private String nome;
	
	private double peso;
	
	private LocalTime tempoDePreparo;
	
	private double preco;
	
	private TipoPorcaoEnum tipoPorcao;
	
	private List<Acompanhamento> acompanhamentos;
	
}
