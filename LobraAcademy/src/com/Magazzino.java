//In un file viene memorizzato il magazzino di una azienda, secondo la notazione:
//biella#7@5
//ruota#3@8
//stelo#2@9
//prima del simbolo '#' vi è il nome del prodotto; fra il simbolo '#' e il simbolo '@' vi è il costo del prodotto;
//dopo il simbolo '@' vi è il quantitativo in pezzi di quel prodotto.
//Il programma deve restituire il controvalore del magazzino .

// somma dei prodotti di quantità e prezzo

// (7*5)+(3*8)+(2*9)

package com;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Magazzino {
	
	public static void main (String[] args) {
		
		File controvalore = new File ("C://Users//39389//Documents//filemagazzino.txt");
		
		try {
			 
			 Scanner in = new Scanner(controvalore);
		 
			 while (in.hasNext()) {
				 
				 String rigaCorrente = in.nextLine();
				 
				 int posizioneCancelletto = rigaCorrente.indexOf("#");
				 int posizioneChiocciola = rigaCorrente.indexOf("@");
				 
				 String costroStringa = rigaCorrente.substring(posizioneCancelletto, posizioneChiocciola);
				 int costo = Integer.parseInt(costroStringa);
				 
				 String quantitaStringa = rigaCorrente.substring(posizioneChiocciola);
				 int quantita = Integer.parseInt(quantitaStringa);
				 
				 int controvaloreCorrente = costo * quantita;
				 
				 System.out.println(controvaloreCorrente);
						 
				 rigaCorrente.substring(posizioneCancelletto,posizioneChiocciola);
				 Integer.parseInt(rigaCorrente);
				 System.out.println(in.nextLine());
			}
			
		} 
		
		catch (FileNotFoundException eccezione) {
			eccezione.getMessage();
			
		}	
	}
	
}
