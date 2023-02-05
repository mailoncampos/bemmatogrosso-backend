package br.com.bemmatogrosso.infra.controller.routers.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bemmatogrosso.infra.controller.presenters.request.CriarMassasDto;

@RestController
@RequestMapping("/massas")
public class CriarMassasRest {

	@PostMapping
	public void criar(@RequestBody CriarMassasDto criarMassas) {
		
		
		System.out.println(criarMassas.getMassasDto());
	}
}
