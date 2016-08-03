package com.algaworks.wine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.wine.repository.VinhoRepository;

@Controller
@RequestMapping("/vinhos")
public class VinhosController {

	@Autowired
	private VinhoRepository vinhoRepository;
	
	@RequestMapping
	public String pesquisa(ModelAndView model) {
		model.addObject("vinhos", vinhoRepository.findAll());
		return "/vinho/ListagemVinhos";
	}
	
	@RequestMapping("/novo")
	public String novo() {
		return "/produto/CadastroProduto";
	}
	
}
