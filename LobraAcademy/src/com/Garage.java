//Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
//1] immissione di un nuovo veicolo
//2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
//3] stampa della situazione corrente dei posti nel garage veicolo:


package com;

public class Garage {
	
	private Veicolo [] postiOccupati; // dichiaro una VARIABILE ARRAY che contiene OGGETTI VEICOLO che si chiama POSTIOCCUPATI la variabile
	
	public Garage () {
		
		postiOccupati = new Veicolo[15]; //il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0
										//qui abbiamo un nuovo array di lunghezza 15 che saranno i posti occupati	

	
	// metodo per immissione nuovo veicolo 
	
	}
	
	public void nuovoVeicoloImmesso(Veicolo veicolo) {
		
		for (int i = 0; i<postiOccupati.length; i++) {
			
			if (postiOccupati[i] == null) { //se posto è libero
				
				postiOccupati[i]= veicolo; // aggiungo il veicolo alla posizione iesima
				
				System.out.println("veicolo inserito alla posizione " +i); // inserimento
				
				return;
				
			}
		}
		
		System.out.println("Non ci sono posti liberi per il nuovo veicolo");
		
	}
	
	public void estrazioneVeicolo(Veicolo veicolo) {
		
		for (int i = 0; i<postiOccupati.length; i++) {
			
			if (postiOccupati)
		}
		
		
		
		
		
	}
		
	}
		
	