package com;

import java.util.Scanner;

public class Matrix{
	
	public static void main(String []args) {
		
		System.out.println("Inserisci la dimensione della matrice :"); // Chiede all'utente di inserire la dimensione della matrice
		
		Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input dell'utente
		
		int dim = scanner.nextInt(); // Legge l'intero inserito dall'utente e lo memorizza nella variabile dim
		
		int [][] matrix = new int [dim][dim]; // Crea una matrice di dimensione dim x dim
		
		System.out.println ("Inserisci i valori nella matrice :"); // Chiede all'utente di inserire i valori della matrice
		
		for (int i = 0; i<dim; i++) { // Ciclo esterno per iterare sulle righe della matrice
			
			for (int j = 0; j<dim; j++) { // Ciclo interno per iterare sulle colonne della matrice
				
				matrix [i][j] = scanner.nextInt(); // Legge l'intero inserito dall'utente e lo assegna alla cella corrispondente della matrice
			}
		}
		
		for (int i = 0; i<dim; i++) { // Ciclo esterno per iterare sulle righe della matrice
			
			for (int j = 0; j<dim; j++) { // Ciclo interno per iterare sulle colonne della matrice
				
				System.out.print(matrix[i][j] + " "); // Stampa il valore della cella corrispondente della matrice seguito da uno spazio
			}
			
			System.out.println(); // Stampa una nuova linea dopo ogni riga della matrice
			
		}
		
		int max = matrix[0][0]; // Inizializza la variabile max con il valore della prima cella della matrice
		int min = matrix[0][0]; // Inizializza la variabile min con il valore della prima cella della matrice
		int sum = 0; // Inizializza la variabile sum a 0
		
		for (int i = 0; i<dim; i++) { // Ciclo per iterare lungo la diagonale principale della matrice
			
			sum = sum + matrix[i][i]; // Aggiunge il valore della cella corrente alla variabile sum
			
			if (max < matrix[i][i]) { // Confronta il valore della cella corrente con il valore massimo attuale
				
				max = matrix[i][i]; // Aggiorna il valore massimo se il valore corrente è maggiore
			}
			
			if (min > matrix[i][i]) { // Confronta il valore della cella corrente con il valore minimo attuale
				
				min = matrix[i][i]; // Aggiorna il valore minimo se il valore corrente è minore
			}
		}
		
		System.out.println("La somma è: " + sum); // Stampa la somma dei valori lungo la diagonale principale
		System.out.println("Il numero massimo è: " + max); // Stampa il valore massimo nella matrice
		System.out.println("Il numero minimo è: " + min); // Stampa il minimo
		
	}
}
