package com;

public class Coin {
	
	//attributi
	
	private String nomeMoneta;
	private double valoreMoneta;
	
	//costruttore
	public Coin(String nomeMoneta, double valoreMoneta) {
		super();
		this.nomeMoneta = nomeMoneta;
		this.valoreMoneta = valoreMoneta;
		
		
	}

	public String getNomeMoneta() {
		return nomeMoneta;
	}

	public double getValoreMoneta() {
		return valoreMoneta;
	}
	
	

}
