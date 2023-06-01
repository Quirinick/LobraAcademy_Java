
//ElencoPersone le cui istanze rappresentano elenchi di persone. La classe avrà i seguenti metodi:
//- un costruttore per creare una lista specificando il numero massimo di persone che è possibile inserire nell'elenco;
//- un metodo aggiungi(Persona p) che aggiunge p all'elenco;
// - un metodo toString() che stampa la lista delle persone nell'elenco.

package com;

import java.security.PublicKey;

public class ElencoPersone {
	
	private Persona[] elenco; //  un array elenco di oggetti Persona che rappresenta l'elenco di persone,
	
	private int maxPersone;
	
	private int numeroPersone;

	public ElencoPersone(int dimensione) {
		
		elenco = new Persona[dimensione];
		
		numeroPersone = 0;
		
	}
	
	public void Aggiungi (Persona p) {
		
		if (numeroPersone<elenco.length) {
			
			elenco[numeroPersone]=p;
			numeroPersone ++;
			System.out.println ("persona aggiunta");
			System.out.println();
		}
		else {
			System.out.println("elenco pieno");
		}
	}
	
   public String toString() {
	   
	   String print = "";
	   
	   for (int i = 0; i<elenco.length; i++) {
		   
		  print = print + elenco[i].toString() + "\n";
			  
	   }
	return print;
	
}
}



		
			
		
		
	
	

			
	


