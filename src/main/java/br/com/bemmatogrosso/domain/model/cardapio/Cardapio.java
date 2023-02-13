package br.com.bemmatogrosso.domain.model.cardapio;

import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.entity.Bebida;
import br.com.bemmatogrosso.domain.model.cardapio.massas.Massas;
import br.com.bemmatogrosso.domain.model.cardapio.outros.Outros;
import br.com.bemmatogrosso.domain.model.cardapio.petisco.Petisco;
import br.com.bemmatogrosso.domain.model.cardapio.porcoes.entity.Porcoes;
import br.com.bemmatogrosso.domain.model.cardapio.pratosexecutivos.PratosExecutivos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Cardapio {
	
	private List<Bebida> bebidas;
	
	private List<Massas> massas;

	private List<Porcoes> porcoes;

	private List<PratosExecutivos> pratosExecutivos;
	
	private List<Outros> outros;
	
	private List<Petisco> petiscos;

}
