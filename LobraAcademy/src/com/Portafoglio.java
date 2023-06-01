//Implementare e testare una classe Portafoglio come collezione di monete.
//Una moneta è un’istanza di una classe Coin:
//gli oggetti di Coin sono immutabili e hanno un nome (nome della moneta) e un valore (valore della moneta).
//Deve essere possibile recuperare l’informazione contenuta in ogni oggetto Coin oltre che implementare i seguenti metodi:
//-addCoin(Coin aCoin): aggiungere una moneta al portafoglio
//-conteggio(String nomeCoin): conta il numero di monete dato un nome moneta
//-getTotal(): restituisce il totale monete presenti nel portafoglio
//-remove(Coin aCoin): rimuove una moneta di valore pari a a Coin se presente nella borsa
//-find(Coin aCoin): restituisce l’indice di una moneta di valore pari a Coin (private)
// - infine una classe test che permette all'utente di accedere tramite un menu alle funzioni di aggiunta moneta
// rimozione moneta, stampa saldo, conteggio e ricerca monete.



package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;


public class Portafoglio {
	
	ArrayList<Coin> listaMonete = new ArrayList<>(); // array list dove andiamo ad aggiungere le monete e memorizzarle nel portafoglio
	
	public void addCoin (Coin aCoin) { // Dichiara un metodo pubblico chiamato addCoin 
		//che prende come argomento un oggetto di tipo Coin.
		//metodo utilizzato per aggiungere una moneta al portafoglio.
		
		listaMonete.add(aCoin); // aCoin è la variabile che fa riferimento alla singola specifica moneta aggiunta al portafoglio
		
	}
	
	public CaricaFile (String path) {
		
		 File file = new File(path);
		 
		 try {
			 
			 Scanner in = new Scanner(file);
			 
			 while (in.hasNext()) {
				 
				 String rigacorrente = in.nextLine();
				 
				 int posizione = rigacorrente.indexOf(';');
				 
				 String nomemoneta = rigacorrente.substring(0,posizione);
				 
				 String valoremonetaString = rigacorrente.substring(posizione +1);
				 
				 double valoremoneta = Double.parseDouble(valoremonetaString);
				 
				 this.addCoin(valoremoneta,nomemoneta);
				 
			 }
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			 
		 	
	}
	
	public void conteggio (String nomeCoin) { // prende come argomento una stringa nomeCoin. 
		//Questo metodo viene utilizzato per contare il numero di monete nel portafoglio con un nome specifico.
		
		int cont = 0; // variabile per tenere traccia del conteggio di quella "moneta specifica"
		
		for (int i = 0; i < listaMonete.size(); i++) { // facciamo un ciclo for iterando lungo la lista  monete.
			
			// Coin è un oggetto ---- coin è una variabile 
			
			Coin coin = listaMonete.get(i); //il metodo get viene usato per la lista per restiture l'elemento iesimo della lista stessa
											// lo assegna alla variabile locale coin di tipo Coin
			
			if (coin.getNomeMoneta().equals(nomeCoin)) {  // controlla se il nome moneta corrente è uguale alla stringa nomeCoin
				
				cont ++;
	
			 }   
			
			 System.out.println("il numero di monete " + "" + nomeCoin + " nel tuo portafoglio e' " + cont );
		   }
		}
	
	public void getTotal() {    //getTotal(): restituisce la somma totale di monete presenti nel portafoglio	
		
		double total = 0; // variabile locale total che accumula il totale
		
		for (int i = 0; i<listaMonete.size(); i++) { // ciclo for per iterare lungo la lista 
			
			Coin coin = listaMonete.get(i); // per ogni moneta ottenuta grazie al get avremo il 
			
			total = total + coin.getValoreMoneta(); //valore e quel valore aggiunto a total
				
		}	
		
		System.out.println("La somma delle monete nel tuo portafoglio e' : " + total);
				
	}
	
	public void remove (Coin aCoin) {       //metodo pubblico chiamato remove che prende come argomento 
										//un oggetto di tipo Coin. Questo metodo viene utilizzato per rimuovere una moneta dal portafoglio.
	
		listaMonete.remove(aCoin); // rimuove l'oggetto aCoin dall'arraylist listaMonete
		System.out.println("La moneta e' stata rimossa");
	}
	
	private int find (Coin aCoin){     //-find(Coin aCoin): restituisce l’indice della prima moneta di valore pari a Coin (private)
		
		for (int i = 0; i<listaMonete.size(); i++) { //
			
			if (listaMonete.get(i).getValoreMoneta() == aCoin.getValoreMoneta()) {
				
				return i; // moneta trovata
			}
		}
		return -1; // se non troviamo la moneta 
	
	}
	
			
	}
	
		
		
	
	
	
	
		
		
	
	
	
	
	
	



