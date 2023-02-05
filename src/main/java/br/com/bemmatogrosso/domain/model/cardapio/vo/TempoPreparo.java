package br.com.bemmatogrosso.domain.model.cardapio.vo;

import java.time.LocalTime;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.TempoPreparoExceptionsMessage;
import lombok.Getter;

@Getter
public class TempoPreparo {
	
	private LocalTime tempoDePreparo;

	public TempoPreparo(LocalTime tempoDePreparo) {	
		
		this.tempoDePreparoDiferenteNull(tempoDePreparo).verificaTempoMaiorQueZero();
		
	}
	
	private TempoPreparo tempoDePreparoDiferenteNull(LocalTime tempoDePreparo) {
		if(tempoDePreparo == null){
			throw new CardapioExceptions(TempoPreparoExceptionsMessage.TEMPO_MENOR_QUE_ZERO);
		}
		this.tempoDePreparo = tempoDePreparo;
		return this;
	}
	
	private TempoPreparo verificaTempoMaiorQueZero() {
		if(this.tempoDePreparo.isBefore(LocalTime.of(0, 0))){
			throw new CardapioExceptions(TempoPreparoExceptionsMessage.TEMPO_NULO);
		}
		return this;
	}
	

}
