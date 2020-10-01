package br.com.felipe.cep.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.felipe.cep.controllers.CepController;
import br.com.felipe.cep.services.CepService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {CepController.class, CepService.class})
public class CepConfig {

	public static void main(String[] args) {		
		SpringApplication.run(CepConfig.class, args);
	}

}
