package br.com.bemmatogrosso.domain.model.cardapio.bebidas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bemmatogrosso.domain.model.cardapio.bebidas.repository.BebidasRepository;

@Service
public class BebidasService {
	
	@Autowired
	private BebidasRepository bebidasRepository;
	

}
