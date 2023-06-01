package com;

import java.util.*;

public class Bank{

	public static int accountNumberGenerator = 0; //genera id univoci per ogni account

	//Attributi
	private ArrayList<BankAccount> contiBancari = new ArrayList<BankAccount>(); 

	//Costruttore
	public Bank(){}


	//Metodi
	public void addAccount(double initialBalance, String customerName){
		contiBancari.add(new BankAccount(initialBalance, customerName, accountNumberGenerator));
		System.out.println("Benvenuto nella nostra Banca "+ customerName +"\nIl tuo saldo iniziale: "+ initialBalance +"\nIl tuo ID: "+accountNumberGenerator);
		accountNumberGenerator++;

	}

	private BankAccount trovaAccount(int accountNumber){

		for(int i = 0; i < contiBancari.size(); i++){

			BankAccount accountTrovato = contiBancari.get(i);
			if(accountTrovato.getAccountNumber() == accountNumber){
				return accountTrovato;
			}
		}
		return null;
	}

	public void deposit(int accountNumber, double amount){
		BankAccount currentAccount = trovaAccount(accountNumber);
		double bilancio = currentAccount.getBalance();
		currentAccount.setBalance(bilancio + amount);
		System.out.println("OK");
	}

	public void withdraw(int accountNumber, double amount){
		this.deposit(accountNumber, -amount);
	}

	public double getBalance(int accountNumber){
		BankAccount currentAccount = trovaAccount(accountNumber);
		return currentAccount.getBalance();
	}

	public void transfer(int fromAccNumber, int toAccNumber, double amount){
		BankAccount fromAccount = trovaAccount(fromAccNumber);
		BankAccount toAccount = trovaAccount(toAccNumber);

		if(fromAccount.getBalance() < amount){
			System.out.println("Denaro non insufficiente");
			return;
		}		

		this.withdraw(fromAccNumber, amount);
		this.deposit(toAccNumber, amount);	
	
	}

	@Override
	public String toString(){

		String elencoConti = "";

		for(BankAccount conto : contiBancari)
			elencoConti += conto.toString()+"\n\n";

		return elencoConti;

	}

	




}

