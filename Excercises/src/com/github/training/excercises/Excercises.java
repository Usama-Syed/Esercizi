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
		esercizio6();
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
		
	}
}

