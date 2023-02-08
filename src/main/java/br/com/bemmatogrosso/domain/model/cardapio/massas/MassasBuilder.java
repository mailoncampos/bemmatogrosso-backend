package br.com.bemmatogrosso.domain.model.cardapio.massas;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.vo.Nome;
import br.com.bemmatogrosso.domain.model.cardapio.vo.Preco;
import br.com.bemmatogrosso.domain.model.cardapio.vo.TempoPreparo;

public class MassasBuilder {
	
	protected Nome nome;
    protected TempoPreparo tempoDePreparo;
    protected List<Molho> molhos;
    protected List<Tempero> temperos;
    protected List<Adicional> adicionais;
    protected List<Massa> massas;
    protected Preco preco;

    public MassasBuilder comNome(String nome) {
      this.nome = new Nome(nome);
      return this;
    }

    public MassasBuilder comTempoDePreparo(Duration tempoDePreparo) {
      this.tempoDePreparo = new TempoPreparo(tempoDePreparo);
      return this;
    }

    public MassasBuilder comMolhos(List<Molho> molhos) {
      this.molhos = molhos;
      return this;
    }

    public MassasBuilder comTemperos(List<Tempero> temperos) {
      this.temperos = temperos;
      return this;
    }

    public MassasBuilder comAdicionais(List<Adicional> adicionais) {
      this.adicionais = adicionais;
      return this;
    }

    public MassasBuilder comMassas(List<Massa> massas) {
      this.massas = massas;
      return this;
    }

    public MassasBuilder comPreco(BigDecimal preco) {
      this.preco = new Preco(preco);
      return this;
    }

    public Massas build() {
      return new Massas(this);
    }
}
