package br.com.bemmatogrosso.infra.repository.cardapio.jpa.model;

import java.util.ArrayList;
import java.util.List;

import br.com.bemmatogrosso.domain.model.cardapio.massas.Molho;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "molhos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MolhoModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
    
    
    public List<MolhoModel> criarListaDeMolhoModel(List<Molho> molhos){
    	
    	List<MolhoModel> molhosModel = new ArrayList<>();
    	
    	molhos.stream().forEach((molho) -> molhosModel.add(new MolhoModel(null, molho.getNome().getNome())));
    	
    	return molhosModel;
    }

}