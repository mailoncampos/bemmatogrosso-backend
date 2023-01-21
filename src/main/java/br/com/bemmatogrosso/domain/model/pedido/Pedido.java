package br.com.bemmatogrosso.domain.model.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.Cardapio;
import br.com.bemmatogrosso.domain.model.cliente.Cliente;
import br.com.bemmatogrosso.domain.model.mesas.Mesa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Pedido {
	
	private Cardapio cardapio;
	
	private List<Mesa> mesas;
	
	private Cliente cliente;
	
	private double valor;
	
	private Status status;
	
	private LocalDateTime dataHoraAtualizacao;

}
