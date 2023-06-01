//Implementare e testare una classe Bank che contenga un ArrayList di oggetti di tipo BankAccount e abbia i seguenti metodi:
//addAccount(initialBalance, customerName)
//deposit(accountNumber, amount)
//withdraw(accountNumber, amount)
//getBalance(accountNumber)
//transfer(fromAccNumber, toAccNumber, amount)
//La classe BankAccount fornirà i classici metodi per il deposito e il prelievo nonchè i metodi per la restituzione delle informazioni 
//in esso contenute.

//Realizzare inoltre una classe di test.


package com;

public class BankAccount{

	//Attributi
	private double balance;
	private String customerName;
	private final int accountNumber;

	//Costruttore
	public BankAccount(double initialBalance, String customerName, int accountNumber){
		this.balance = initialBalance;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
	}

	//Metodi
	public void setBalance(double newBalance){
		this.balance = newBalance;
	}

	public double getBalance(){
		return this.balance;
	}

	public void setCustomerName(String newName){
		this.customerName = newName;
	}

	public String getCustomerName(){
		return this.customerName;
	}

	public int getAccountNumber(){
		return this.accountNumber;
	}

	@Override
	public String toString(){
		return "Conto numero: "+ this.accountNumber + "\nIntestatario: "+ this.customerName + "\nSaldo: " + this.balance;
	}



}
