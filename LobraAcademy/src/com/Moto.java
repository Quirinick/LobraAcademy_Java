package com;

//moto:tempi

public class Moto extends Veicolo {
	
	private String tempi;

	public Moto(String marca, int anno, int cilindata) {
		super(marca, anno, cilindata);
		this.tempi = tempi;
	}

	public String getTempi() {
		return tempi;
	}
	
	
	@Override
	
	public String toString () {
		
		return super.toString() + "tempi" + getTempi();
	
	}
}


	
	
	
