package com;

public class BarraDiEnergiaPercentuale extends BarraDiEnergia {

	public BarraDiEnergiaPercentuale(int energia) {
		super(energia);
		
	}
	@Override
	
	public String toString() {
		int numeroCerchi = barra.indexOf("=");
		double percentuale = ((double) numeroCerchi/k)*100;
		if(numeroCerchi == -1) {
			percentuale = 100;
		}
		return barra + " --> " + percentuale + "%";
		
	}
	
	
}
