package com;

import java.util.Scanner;

public class TestPotenza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basePotenza = sc.nextInt();
		
		Potenza pippo = new Potenza(basePotenza);
		pippo.pow();
		
		Scanner sc2 = new Scanner(System.in);
		int cambioBase = sc2.nextInt();
		
		
		pippo.cambioBase(cambioBase);
		pippo.pow();
		

	}

}