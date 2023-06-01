package com;

public class Potenza {

	int x;
	
	public Potenza(int numero) {
		this.x = numero;
	}
	
	public void pow() {
		System.out.println(" "+x*x);
	}
	
	public void cambioBase(int numero2) {
		this.x = numero2;
	}
}
