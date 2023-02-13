package br.com.bemmatogrosso.infra.controller.routers.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bemmatogrosso.infra.controller.presenters.request.CriarPorcaoDto;

@RestController
@RequestMapping("/porcoes")
@CrossOrigin("http://localhost:4200/")
public class CriarPorcoesRestController {
	
	/*@Autowired
	private CriarMassasUserCase criarMassasUserCase;*/

	@PostMapping
	public ResponseEntity<Object> criar(@RequestBody CriarPorcaoDto criarPorcao) {
		//criarMassasUserCase.executa(criarMassas.toMassasInputDtos());
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
}
