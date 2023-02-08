package br.com.bemmatogrosso.infra.controller.routers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bemmatogrosso.infra.controller.presenters.request.CriarMassasDto;
import br.com.bemmatogrosso.usercase.cardapio.massas.CriarMassasUserCase;

@RestController
@RequestMapping("/massas")
public class CriarMassasRestController {
	
	@Autowired
	private CriarMassasUserCase criarMassasUserCase;

	@PostMapping
	public ResponseEntity<Object> criar(@RequestBody CriarMassasDto criarMassas) {
		criarMassasUserCase.executa(criarMassas.toMassasInputDtos());
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
}
