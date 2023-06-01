//Si definisca poi una classe Studente come
//estensione di Persona; i campi aggiuntivi di Studente rispetto a Persona sono matricola e
//università. Inoltre la classe Studente dovrà avere i metodi per impostare e leggere tali campi
//e dovrà sovrascrivere il metodo toString()


package com;

public class Studente extends Persona {
	
	protected String matricola;
	protected String universita;

	public Studente(String codiceFiscale, String nome, String cognome) {
		super(codiceFiscale, nome, cognome);
		
	}

	public String getMatricola() {
		return matricola;
	}

	public String getUniversita() {
		return universita;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public void setUniversita(String universita) {
		this.universita = universita;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", universita=" + universita + "]";
	}
		

}
