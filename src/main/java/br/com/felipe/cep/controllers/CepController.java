package br.com.felipe.cep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.felipe.cep.dtos.CepForm;
import br.com.felipe.cep.models.Cep;
import br.com.felipe.cep.services.CepService;

@Controller @RequestMapping("/cep")
public class CepController {
	
	@Autowired
	private CepService cepService;


	@GetMapping
	public String index() {
		return "index";
	}
	
	
	@PostMapping
	public String lerCep(CepForm cepForm, Model model) {
		Cep cep = cepService.info(cepForm);
		return cepService.resultado(cep, model);
	}

}
