package br.com.bemmatogrosso.infra.controller.routers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bemmatogrosso.usercase.cardapio.bebidas.BuscarInformacoesCadastroBebidasserCase;

@RestController
@RequestMapping("/bebidas")
@CrossOrigin("http://localhost:4200/")
public class InformacoesParaCadastrarBebidasRestController {

	@Autowired
	private BuscarInformacoesCadastroBebidasserCase buscarInformacoesCadastroBebidasserCase;

	@GetMapping("/informacoes")
	public ResponseEntity<Object> buscar() {
		return ResponseEntity.status(HttpStatus.OK).body(buscarInformacoesCadastroBebidasserCase.executa());
	}
}
