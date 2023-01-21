package br.com.bemmatogrosso.domain.model.cardapio.pratosexecutivos;

import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PratosExecutivos {
	
	private String nome;
	
	private double peso;
	
	private LocalTime tempoDePreparo;
	
	private List<Acompanhamento> acompanhamentos;

}
