package com;

import java.util.Scanner;

public class DueSequenze {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Inserisci la prima sequenza di 5 elementi:");
	        String primaSequenza = scanner.nextLine();
	    
	        System.out.println("Inserisci la seconda sequenza di 5 elementi:");
	        String secondaSequenza = scanner.nextLine();

	        String[] array1 = primaSequenza.split("-");
	      //  System.out.println(array1);
	        String[] array2 = secondaSequenza.split("-");
	      //  System.out.println(array1.toString());

	        boolean trovata = false;
/* for (int i = 0; i < array1.length; i++) {
	 String str1 = array1[i];
	 if (trovata) {
       break;
   }
	 for (int l = 0; l < array2.length; l++) {
		 String str2 = array2[l];
		 if (str1.equals(str2)) {
	           trovata = true;
	           break;
	            
	       }
	 }
	   
	 
} */

	    for (String str1 : array1) {
	            for (String str2 : array2) {
	                if (str1.equals(str2)) {
	                    trovata = true;
	                    break;
	                }
	            }
	            if (trovata) {
	                break;
	            }
	        } 

	        if (trovata) {
	            System.out.println("OK");
	        } else {
	            System.out.println("NO");
	        }
	    }
	

}
