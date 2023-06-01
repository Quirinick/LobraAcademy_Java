package com;


public class MetodoArray {
	public static void main(String[] args) {
		String[] array = {"a","b","c","d","e"};
		String valore = "z";
		boolean trovato = false;
		
		for(int t = 0; t < array.length; t++) {
			if (array[t].equals(valore)) {
				System.out.println("L' ABBIAMO TROVATO!!!");
				trovato = true;
				break;
			}	
		}
		System.out.println(trovato);		
	}
}
