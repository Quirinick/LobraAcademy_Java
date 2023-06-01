package com;

import java.lang.reflect.AnnotatedArrayType;

//auto:porte, alimentazione (diesel/benzina)

	public class Auto extends Veicolo{
	
	private int porte;
	private String alimentazione;
	 
	
	public Auto(String marca, int anno, int cilindata) {
		
		super(marca, anno, cilindata);
		
		this.porte = porte;
		this.alimentazione = alimentazione;
	}


	public int getPorte() {
		return porte;
	}


	public String getAlimentazione() {
		return alimentazione;
	}
	

	@Override
	
	public String toString () {
		
		return super.toString() + "marca" + getMarca() + "anno" + getAnno() + "cilindata" + getCilindrata();
 	}
	
	

}
