//Si scriva poi una classe ProvaListaPersone con il solo metodo main che crea una lista di
//persone la cui dimensione è scelta dall'utente; chiede poi ripetutamente all'utente di inserire, a
//sua scelta, una Persona, uno Studente o un Docente, chiedendo i dati opportuni; infine
//stampa la lista delle persone inserite.


package com;

import java.util.Scanner;

public class ProvaListaPersone {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci la dimensione dell'elenco: ");
		
		int dimensione = scanner.nextInt();
		scanner.nextLine();
		
		//creiamo un nuovo oggetto elencoPersone che rappresenta la lista con la dimensione scelta da noi
		
		
		ElencoPersone elencoPersone = new ElencoPersone(dimensione);
		
		for (int i = 0; i<dimensione; i++) {
			
			System.out.println("Inserimento dati");
			System.out.println();
			
			System.out.println("Nome");
			String name = scanner.nextLine();
			System.out.println();
			
			System.out.println("Cognome");
			String surname = scanner.nextLine();
			System.out.println();
			
			
			System.out.println("Codice fiscale");
			String fiscalCode = scanner.nextLine();
			System.out.println();
			
			
			
			
			Persona persona = new Persona(name, surname, fiscalCode); 
			
			elencoPersone.Aggiungi(persona); // aggiungo la persona all'elenco
						
		}
		
		 System.out.println("Elenco:");
		 
		 System.out.println(elencoPersone.toString());
		
		
	}


}
