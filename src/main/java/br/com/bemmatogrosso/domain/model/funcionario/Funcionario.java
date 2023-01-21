package br.com.bemmatogrosso.domain.model.funcionario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Funcionario {
	
	private String nome;
	
	private CPF cpf;

}
