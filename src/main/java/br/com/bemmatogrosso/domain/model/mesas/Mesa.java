package br.com.bemmatogrosso.domain.model.mesas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Mesa {
	
	private int numero;
	
	private StatusEnum status;

}
