/* 
Creare una classe BarraDiEnergia costruita con un  intero k che ne determina la lunghezza massima.  
Inizialmente la barra è vuota. La barra è dotata di un  metodo per l’incremento unitario del suo livello di  riempimento e 
di un metodo toString che ne fornisca la  rappresentazione sotto forma di stringa (es. se il livello è  3 su 10, la stringa sarà “OOO=======”.
Creare quindi una seconda classe  BarraDiEnergiaConPercentuale che fornisce una  
rappresentazione sotto forma di stringa come  BarraDiEnergia ma stampando in coda alla stringa la  
percentuale del livello di riempimento. Per esempio, se il  livello è 3 su 10, la stringa sarà “OOO======= 30%”.
*/

package com;

public class BarraDiEnergia {
	protected int k;
	
	protected String barra;
	
	public BarraDiEnergia(int energia) {
		k = energia;
		this.barra = "";
		for (int i = 0; i < k; i++) {
			this.barra = this.barra.concat("=");
		}
	}
	
	public void incrementoUnitario() {
		this.barra = this.barra.replaceFirst("=", "O");
	}
	
	public String toString() {
		return this.barra;
	}
	
	public static void main(String[] args) {
		BarraDiEnergiaPercentuale a = new BarraDiEnergiaPercentuale(10);
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(a.toString());
			a.incrementoUnitario();
		}
		
			
		
	}
}