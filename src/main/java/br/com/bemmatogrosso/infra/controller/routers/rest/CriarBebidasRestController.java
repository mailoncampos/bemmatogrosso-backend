package br.com.bemmatogrosso.infra.controller.routers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bemmatogrosso.infra.controller.presenters.request.CriarBebidaDto;
import br.com.bemmatogrosso.usercase.cardapio.bebidas.dto.CriarBebidasUserCase;

@RestController
@RequestMapping("/bebidas")
public class CriarBebidasRestController {
	
	@Autowired
	private CriarBebidasUserCase criarBebidasUserCase;
	
	@PostMapping
	public ResponseEntity<Object> criar(@RequestBody CriarBebidaDto criarBebida) {
		criarBebidasUserCase.executa(criarBebida.getBebidasDto().toBebidasInputDto());
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}

}
