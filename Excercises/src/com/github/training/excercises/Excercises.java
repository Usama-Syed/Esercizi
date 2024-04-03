package com.github.training.excercises;

import java.util.Scanner;

import com.github.training.excercises.bean.Cane;

public class Excercises {

	public static void main(String[] args) {
		
		//example();
		//esercizio1();
		//esercizio2();
		//esercizio3();
		//esercizio4();
		//esercizio5();
		//esercizio6();
		esercizio7();
	}
	
	private static void example() {
		Scanner input = new Scanner(System.in);
		int number = 0;
		String result = null;
		Cane myDog = new Cane();
		int[] numbers = new int[5];
		
		System.out.print("Digitare un numero intero ");
		number = input.nextInt();
		
		if (number % 2 == 0) {
			result = "Il numero digitato " + number + " è un numero pari";
		} else {
			result = "Il numero digitato" + number + " un numero dispari";
		}
		
		System.out.println("Hello World, Java app");
		System.out.println("Number: " + number);
		System.out.println(result);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digitare un numero intero ");
			number = input.nextInt();
			numbers[i] = number;
			System.out.println("Numero " + (i+1) + ": " + numbers[i]);
		}
		
		input.close();
		System.out.print("Fine Programma");
	}
	
	private static void esercizio1() {
		//TODO Esercizio 1:
		// Dato un numero in input, restituire (stampare) il quadrato del numero (potenza con base il numero e esponente 2)
		Scanner input = new Scanner(System.in);
		int number = 0;
		int quadrato = 0;
		
		System.out.print("Digitare un numero per ottenere il quadrato ");
		number = input.nextInt();
		quadrato = number * number;
		
		input.close();
		
		System.out.println ("Il quadrato del numero inserito è " + quadrato);
	
	}
	
	private static void esercizio2() {
	
		//TODO Esercizio 2:
		// Dato un numero in input compreso tra 1 e 6, stampare la iesima lettera dell'alfabeto corrispondente
		Scanner input = new Scanner(System.in);
		int number;
		String result;
		
		System.out.print("Digitare un numero compreso tra 1 e 6, per trovare la lettera ad esso associato ");
		number = input.nextInt();
		input.close();
		
	
		
		if(number == 1) {
			result = "Il numero inserito è " + number + " la lettera associata è A";
		}else if(number == 2) {
			result = "Il numero inserito è " + number + " la lettera associata è B";
		}else if(number == 3) {
			result = "Il numero inserito è " + number + " la lettera associata è C";
		}else if(number == 4) {
			result = "Il numero inserito è " + number + " la lettera associata è D";
		}else if(number == 5) {
			result = "Il numero inserito è " + number + " la lettera associata è E";
		}else if(number == 6) {
			result = "Il numero inserito è " + number + " la lettera associata è F";
		} else {
			result = "Il numero inserito non è associato a nessuna lettera";
		}
		
		System.out.print(result);
		
			
	}
	
	private static void esercizio3() {

		//Esercizio 3:
		//Dato un numero in input, restituire (stampare) "IN SALDO" se è minore di 30, "NUOVA STAGIONE" in caso contrario.
		Scanner input = new Scanner(System.in);
		int number;
		String result;
		
		System.out.print("Digitare un numero per controllare se il capo è in saldo");
		number = input.nextInt();
		input.close();
		
		if(number < 30) {
			result = "Il capo è IN SALDO";
		} else {
			result = "Il capo è in NUOVA STAGIONE";
		}
		
		System.out.print(result);
	}

	private static void esercizio5() {

		//Esercizio 5:
		//Dato un array di 5 interi, trovarne il valore massimo.

		int[] number = new int[] {5,10,15,30,40};
		int valore_max = 0;


		for(int i = 0; i < number.length; i++) {

			if(number[i] > valore_max) {
				valore_max = number[i]; 
			}

		}

		System.out.print("Il valore massimo è: " + valore_max); 

	}

	private static void esercizio6() {
		//Esercizio 6:
		//Dato un numero X in input, stampare "X E' UN NUMERO PRIMO" in caso sia un numero primo, "X NON E' UN NUMERO PRIMO" in caso contrario.

		Scanner input = new Scanner(System.in);
		int number;
		String result = null;

		System.out.print("Inserire numero ");
		number = input.nextInt();
		input.close();

		for(int i = 2; i < number; i++) {
			if (number % i == 0) {
				result = "Il numero " + number + " non è primo";
			}
		}
		if(result == null) {
			result = "Il numero " + number + " è primo";
		}

		System.out.print(result);

	}
	
	private static void esercizio7() {
		//Esercizio 7:
		//Dato un array di numeri, calcolare:
			//1)il valore medio delle posizioni pari e di quelle dispari;
			//2)sostituire con -1 tutti i valori inferiori al valore medio complessivo, 1 i valori superirori alle media e con 0 i valori uguali alle media;
			//3)stampare per ciasuno elemento dell'array "SCARTATO" se vale 0, "VALIDO" se vale 1, "INVALIDO" se vale -1.
		
		int[] number = new int[] {5,10,20,25,18,30};
		float medPari = 0f; //float o double lo si utilizza per le medie, essendo un tipo decimale.
		float medDispari = 0f;
		float totalePari = 0f;
		float totaleDispari = 0f;
		float media = 0f;
		int valoreVecchio;
		String esito;
		
		for(int i = 0; i < number.length; i++) {
			if(i % 2 == 0) {
				totalePari = totalePari + number[i];
			} else {
				totaleDispari = totaleDispari + number[i];
			}
		}
		medPari = totalePari / (number.length / 2);
		medDispari = totaleDispari / (number.length / 2);
		
		System.out.println("La media pari è: " + medPari);
		System.out.println("La media dispari è: " + medDispari);
		
		//il totale degli elementi contenuti, diviso la lunghezza.
		
		media = (totalePari + totaleDispari) / number.length;
		
		
		for(int i = 0; i < number.length; i++) {
			
			valoreVecchio = number[i];
			
			if(number[i] < media) {
				number[i] = -1;
				esito = " Invalido ";
			}else if(number[i] > media){
				number[i] = 1;
				esito = " Valido ";
			} else{
				number[i] = 0;
				esito = " Scartato ";
			}
			
			System.out.println(valoreVecchio + " è" + esito + number[i] );

		}
	
		System.out.print("La media totale è: " + media);

	}
}

