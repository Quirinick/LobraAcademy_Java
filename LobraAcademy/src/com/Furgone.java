package com;

//furgone:capacità
public class Furgone extends Veicolo {
	
	private String capacità;

	public Furgone(String marca, int anno, int cilindata) {
		super(marca, anno, cilindata);
		
		
	}

	public String getCapacità() {
		return capacità;
	}
	
	
	@Override
	
	public String toString () {
		
		return super.toString() + "capacita'" + getCapacità(); 
	}
	

}
