package com;

/*
Progettare una classe che costituisca un modello di  registratore di cassa
La classe deve consentire a un cassiere di digitare i  prezzi di articoli e la quantità di denaro pagata dal  cliente, 
calcolando il resto dovuto
Quali metodi vi servono?
Registra il prezzo di vendita per un articolo
Registra la somma di denaro pagata
Calcola il resto dovuto al cliente
*/

public class RegistratoreDiCassa{

	private String vendite="";

	public double registraVendita(double prezzo, double pagamento){

		if(pagamento<prezzo)
			return -1;
		else{
			vendite+=prezzo+","+pagamento+"\n";
			return calcolaResto(pagamento, prezzo);
		}
	}

	private double calcolaResto(double pagamento, double prezzo){
		return pagamento-prezzo;
	}

	private String calcolaResto(String pagamento, String prezzo){
		return ""+(Double.parseDouble(pagamento) - Double.parseDouble(prezzo));
	}


	@Override
	public String toString(){

		String prettyPrint="";

		String[] venditeEffettuate = vendite.split("\n");

		for(String vendita : venditeEffettuate)
			prettyPrint+="Prezzo: "+ vendita.split(",")[0] + " Somma pagata: " + vendita.split(",")[1]+" Resto Dovuto: "+ calcolaResto(vendita.split(",")[1], vendita.split(",")[0])+"\n";

		return prettyPrint;
	}

	public static void main(String[] args){

		RegistratoreDiCassa reg = new RegistratoreDiCassa();

		reg.registraVendita(10, 25);
		reg.registraVendita(20, 21);

		System.out.println(reg);
	}
}
