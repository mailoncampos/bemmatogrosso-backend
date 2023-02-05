package br.com.bemmatogrosso.domain.model.cardapio.vo;

import java.time.Duration;

import br.com.bemmatogrosso.domain.exceptions.CardapioExceptions;
import br.com.bemmatogrosso.domain.exceptions.TempoPreparoExceptionsMessage;
import lombok.Getter;

@Getter
public class TempoPreparo {
	
	private Duration tempoDePreparo;

	public TempoPreparo(Duration tempoDePreparo) {	
		
		this.tempoDePreparoDiferenteNull(tempoDePreparo).verificaTempoMaiorQueZero();
		
	}
	
	private TempoPreparo tempoDePreparoDiferenteNull(Duration tempoDePreparo) {
		if(tempoDePreparo == null){
			throw new CardapioExceptions(TempoPreparoExceptionsMessage.TEMPO_NULO);
		}
		this.tempoDePreparo = tempoDePreparo;
		return this;
	}
	
	private TempoPreparo verificaTempoMaiorQueZero() {
		if(this.tempoDePreparo.isNegative() && this.tempoDePreparo.isZero()){
			throw new CardapioExceptions(TempoPreparoExceptionsMessage.TEMPO_MENOR_QUE_ZERO);
		}
		return this;
	}
	

}
