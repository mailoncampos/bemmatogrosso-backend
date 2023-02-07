package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model.massas;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Massas;
import br.com.bemmatogrosso.infra.config.jpa.DurationAttributeConverter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "massas")
@AllArgsConstructor
@Getter
public class MassasModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "time_preparo", nullable = false, columnDefinition = "interval")
    @Convert(converter = DurationAttributeConverter.class)
    private Duration timePreparo;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "massas_molhos",
            joinColumns = @JoinColumn(name = "massa_id"),
            inverseJoinColumns = @JoinColumn(name = "molho_id"))
    private List<MolhoModel> molhos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "massas_temperos",
            joinColumns = @JoinColumn(name = "massa_id"),
            inverseJoinColumns = @JoinColumn(name = "tempero_id"))
    private List<TemperoModel> temperos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "massas_adicional_massas",
            joinColumns = @JoinColumn(name = "massa_id"),
            inverseJoinColumns = @JoinColumn(name = "adicional_massas_id"))
    private List<AdicionalModel> adicionais;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "massas_tipo_massa",
            joinColumns = @JoinColumn(name = "massa_id"),
            inverseJoinColumns = @JoinColumn(name = "tipo_massa_id"))
    private List<MassaModel> tiposMassa;
	
	public MassasModel(Object object) {
		
		Massas massas =(Massas)object;
		
		this.preco = massas.getPreco().getPreco();
		this.nome = massas.getNome().getNome();
		this.timePreparo = massas.getTempoDePreparo().getTempoDePreparo();
		this.molhos = new MolhoModel().criarListaDeMolhoModel(massas.getMolhos());
		this.temperos = new TemperoModel().criarListaDeTemperoModel(massas.getTemperos());
		this.tiposMassa = new MassaModel().criarListaDeMassaModel(massas.getMassas());
		this.adicionais = new AdicionalModel().criarListaDeAdicionalModel(massas.getAdicionais()); 
	}

}
