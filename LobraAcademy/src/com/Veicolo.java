//Si realizzi una applicazione java per la gestione di un garage secondo le specifiche:
//il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0 e per motivi di capienza 
//può ospitare solo auto moto e furgoni partendo dalla classe base veicolo a motore V; la si estenda, 
//realizzando anche le classi che modellano le entità furgone (F) auto (A) e moto (M).
//Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la riguardano.
//Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
//1] immissione di un nuovo veicolo
//2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
//3] stampa della situazione corrente dei posti nel garage veicolo:
//marca,anno,cilindrata;
//auto:porte, alimentazione (diesel/benzina)
//moto:tempi
//furgone:capacità

package com;

public class Veicolo {   // classe base Veicolo
	
	private String marca;   // li dichiaro pubblici per evitare i get-set
	private int anno;
	private int cilindrata;
		
	//costruttore
	public Veicolo(String marca, int anno, int cilindata) {
		super();
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}
	
	public String getMarca() {
		return marca;
	}




	public int getAnno() {
		return anno;
	}



	public int getCilindrata() {
		return cilindrata;
	}



	//Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la riguardano.
	
	
	@Override
	// usiamo override perchè la classe toString è figlia della classe Veicolo
	
	
	
	public String toString () {
		
		
	 return "marca" + marca + "anno" + anno + "cilindata" + cilindrata;
		
	}
}

	
