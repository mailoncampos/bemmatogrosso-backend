package br.com.bemmatogrosso.infra.controller.routers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bemmatogrosso.infra.controller.presenters.request.CriarPorcaoDto;
import br.com.bemmatogrosso.usercase.cardapio.porcoes.CriarPorcoesUserCase;

@RestController
@RequestMapping("/porcoes")
@CrossOrigin("http://localhost:4200/")
public class CriarPorcoesRestController {
	
	@Autowired
	private CriarPorcoesUserCase criarPorcoesUserCase;

	@PostMapping
	public ResponseEntity<Object> criar(@RequestBody CriarPorcaoDto criarPorcao) {
		
		criarPorcoesUserCase.executa(criarPorcao.toPorcaoInputDto());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
}
