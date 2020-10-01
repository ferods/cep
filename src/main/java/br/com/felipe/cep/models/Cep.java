package br.com.felipe.cep.models;

import br.com.felipe.cep.dtos.CepForm;

public class Cep {
	
	private String numero;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Cep() {
	}
	
	public Cep(CepForm cepForm) {
		this.numero = cepForm.getNumero();
	}
	
	public Cep(String logradouro, String bairro, String cidade, String uf) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}


	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Cep [numero=" + numero + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + "]";
	}
	

	

}
