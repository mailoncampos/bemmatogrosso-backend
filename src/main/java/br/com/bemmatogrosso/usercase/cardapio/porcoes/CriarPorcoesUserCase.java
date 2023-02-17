package br.com.bemmatogrosso.usercase.cardapio.porcoes;

import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.porcoes.entity.Porcoes;
import br.com.bemmatogrosso.domain.model.cardapio.porcoes.entity.PorcoesBuilder;
import br.com.bemmatogrosso.domain.model.cardapio.porcoes.repository.PorcoesRepository;

@Service
public class CriarPorcoesUserCase {

	//@Autowired
	private PorcoesRepository porcoesRepository;

	public PorcoesOutputDto executa(PorcoesInputDto porcoesInputDto) {

		Porcoes porcao = new PorcoesBuilder().comNome(null).comPreco(null).comPeso(0).comTempoPreparo(null).build();
		
		this.porcoesRepository.criar(porcao);

		return null;
	}
}
