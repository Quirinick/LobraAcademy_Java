package com;

import java.util.Scanner;

public class MainTestPortafoglio {
	
	public static void main (String []args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int scelta = 0;
		
		while (scelta !=6) {
			
			System.out.println("Inserisci quale azione vuoi compiere:");
            System.out.println("-1. Aggiungere una moneta");
            System.out.println("-2. Contare le monete (il nome)");
            System.out.println("-3. Conoscere quanti soldi hai nel portafoglio");
            System.out.println("-4. Conoscere se hai una moneta da x euro");
            System.out.println("-5. Rimuovere una moneta");
            System.out.println("-6. Uscire");
            
            scelta = scanner.nextInt();
            
            scanner.nextLine(); 
            
            switch (scelta) {
            
			case 1: System.out.println("Hai scelto di aggiungere una moneta");
			
				
				break;
				
			case 2: System.out.println("Hai scelto di contare le monete (il nome)");	
			
			
			break;
			
			case 3: System.out.println("Hai scelto di sapere quanti soldi hai nel portafogli");	
			
			
			break;
			
			case 4: System.out.println("Hai scelto di aggiungere una moneta");	
			
			
			break;
			
			case 5: System.out.println("Hai scelto di aggiungere una moneta");	
			
			
			break;
			
			case 6: System.out.println("Hai scelto di aggiungere una moneta");	
			
			
			break;

			default:
				break;
			}
		}
		
		
	}

}
