//Si scriva una classe Persona dotata dei campi
//CodiceFiscale, Nome, Cognome e dei metodi per impostare e leggere tali valori. La classe
//inoltre dovrà essere dotata del metodo toString()

package com;


public class Persona {
	
	
	private String nome;
	private String codiceFiscale;
	private String cognome;
	
	
	public Persona(String codiceFiscale, String nome, String cognome) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public String getNome() {
		return nome;
	}


	public String getCognome() {
		return cognome;
	}


	@Override
	public String toString() {
		return "Persona [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}






