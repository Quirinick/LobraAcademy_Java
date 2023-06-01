package com;
import java.util.*;

public class mainClass {

	public static void main(String[] args){

		System.out.println("Banca di William 1.0");

		Bank laMiaBanca = new Bank();
		Scanner in = new Scanner(System.in);

		//variabili di controllo:
		int id;


		boolean esegui = true;
		while(esegui){
			System.out.println();

			System.out.print(">");
			String command = in.nextLine();

			System.out.println();
			switch(command){

				case "aiuto":
					System.out.println("Lista dei comandi:");
					System.out.println(" - creaAccount");
					System.out.println(" - deposita");
					System.out.println(" - preleva");
					System.out.println(" - saldo");
					System.out.println(" - trasferisci");
					System.out.println(" - elencoConti");
					System.out.println(" - esci");
					break;

				case "creaAccount":
					System.out.print("Nome e Cognome: ");
					String nome = in.nextLine();
					System.out.print("Deposito iniziale: ");
					double sommaIniziale = in.nextDouble();
					in.nextLine(); //conuma il "\n" non catturato da nextDouble()
					laMiaBanca.addAccount(sommaIniziale, nome);
					break;

				case "deposita":
					System.out.print("Il tuo ID: ");
					id = in.nextInt();
					in.nextLine(); //conuma il "\n" non catturato da nextInt()
					System.out.print("Somma da depositare: ");
					double sommaDeposito = in.nextDouble();
					in.nextLine(); //conuma il "\n" non catturato da nextDouble()
					laMiaBanca.deposit(id, sommaDeposito);
					break;
				

				case "preleva":
					System.out.print("Il tuo ID: ");
					id = in.nextInt();
					in.nextLine(); //conuma il "\n" non catturato da nextInt()
					System.out.print("Somma da prelevare: ");
					double sommaPrelievo = in.nextDouble();
					in.nextLine(); //conuma il "\n" non catturato da nextDouble()
					laMiaBanca.withdraw(id, sommaPrelievo);
					break;
				

				case "saldo":
					System.out.print("Il tuo ID: ");
					id = in.nextInt();
					in.nextLine(); //conuma il "\n" non catturato da nextInt()
					System.out.println("Il tuo saldo è: " + laMiaBanca.getBalance(id));
					break;

				case "trasferisci":
					System.out.print("ID del mittente: ");
					int idMittente = in.nextInt();
					in.nextLine(); //conuma il "\n" non catturato da nextInt()

					System.out.print("ID del mittente: ");
					int idDestinatario = in.nextInt();
					in.nextLine(); //conuma il "\n" non catturato da nextInt()

					System.out.print("Somma da trasferire: ");
					double somma = in.nextDouble();
					in.nextLine(); //conuma il "\n" non catturato da nextDouble()

					laMiaBanca.transfer(idMittente, idDestinatario, somma);
					break;

				case "elencoConti":
					System.out.println(laMiaBanca);
					break;

				case "esci":
					esegui = false;
					break;

				default:
					System.out.println("Comando sconosciuto");
					break;

			}
		}

	}		
		
	}


