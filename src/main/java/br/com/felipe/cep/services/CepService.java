package br.com.felipe.cep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.com.felipe.cep.components.WebServiceCep;
import br.com.felipe.cep.controllers.CepController;
import br.com.felipe.cep.dtos.CepForm;
import br.com.felipe.cep.models.Cep;

      

@Service
public class CepService {

	@Autowired
	CepController cepController;
	
	public Cep info(CepForm cepForm) {
	WebServiceCep searchCep = WebServiceCep.searchCep(cepForm.getNumero());
	 Cep cep = new Cep(searchCep.getLogradouro(), searchCep.getBairro(), searchCep.getCidade(), searchCep.getUf());
	 return cep;	
	}

	public String resultado (Cep cep, Model model) {		
		model.addAttribute("cepp", cep);
		return cepController.index();
		}
	

}
