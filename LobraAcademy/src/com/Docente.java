//Si definisca infine la classe Docente che estende
//Persona con campi aggiuntivi materia e salario. Anche in questo caso la classe dovrà avere
//metodi per leggere e impostare i vari attributi e dovrà sovrascrivere il metodo toString().


package com;

public class Docente extends Persona {
	
	private String materia;
	private double salario;

	public Docente(String codiceFiscale, String nome, String cognome) {
		super(codiceFiscale, nome, cognome);
			
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Docente [materia=" + materia + ", salario=" + salario + "]";
	}
	

}
