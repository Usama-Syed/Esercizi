package com.github.training.excercises;
import java.util.Iterator;
import java.util.Scanner;

import com.github.training.excercises.bean.Cane;

public class Excercises {

	public static void main(String[] args) {
	
		//example();
		//esercizio1();
		
		//esercizioGradi();
//		esercizio1Mio();
//		esercizio2();
//		esercizio3();
//		esercizio5();
		esercizio6();
//		esercizio7();
		
		
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
		//TODO 
	}
	
	
	static void esercizioGradi() {
		Scanner number = new Scanner(System.in);
		System.out.println("Inserire i gradi");
		
		int inputNumber = number.nextInt();
		
		Scanner character = new Scanner(System.in);
		System.out.println("Inserire carattere");
		
		String inputChar = character.next().toUpperCase();
		
		 if(inputChar.equals("C")) {
			System.out.print("Il valore convertito in Farenith è " + (inputNumber * 1.8 + 32));
		} else if(inputChar.equals("F")) {
			System.out.print("Il valore convertito in Celsius è " + (inputNumber - 32) / 1.8);
		} else {
			System.out.println("Valore non valido");
		}

	}
	
	
	static void esercizio1Mio() {
		Scanner number = new Scanner(System.in);
		
		System.out.println("inserire numero di input");
		
		int inputNumber = number.nextInt();
		
		int result = 0;
		
		result = inputNumber * inputNumber;
		
		System.out.println("Il quadrato del numero dato in input è " + result);
		
		number.close();
		
		
	}
	
	static void esercizio2() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire un numero di input da 1 a 6");
		int number = input.nextInt();
		
		switch (number) {
		case 1: {
			System.out.println("A");
			break;
		}
		case 2: {
			System.out.println("B");
			break;
		}
		case 3: {
			System.out.println("C");
			break;
		}
		case 4: {
			System.out.println("D");
			break;
		}
		case 5: {
			System.out.println("E");
			break;
		}
		case 6: {
			System.out.println("F");
			break;
		}
		default:
			System.out.println("Numero non valido");
		}
		
		input.close();
	}
	
	static void esercizio3() {
		Scanner number = new Scanner(System.in);
		
		System.out.println("Inserire il prezzo");
		
		if(number.nextInt() < 30) {
			System.out.print("IN SALDO");
		} else {
			System.out.print("NUOVA STAGIONE");
		}
		
		number.close();
	}
	
	static void esercizio4() {
		Scanner input = new Scanner(System.in);
		
		String inputString = input.next();
		
		
	}
	
	static void esercizio5() {
		int[] numbers = new int[5];
		int max = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire i numeri: ");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		
		for (int i = 0; i < numbers.length-1; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		System.out.println("Il numero massimo è " + max);
		
		
	}
	
	static void esercizio6() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserire un numero");
		
		int number = input.nextInt();
		
		String result = null;
				
		for (int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				result = "il numero " + number + " non è un numero primo";
				break;
			} 
		}
		
		if(result == null) {
			result = "il numero " + number + " è un numero primo";
		}
		
		System.out.println(result);
		
	}
	
	static void esercizio7() {
		int[] numbers = new int[] {10,55,87,66,99,47,102,51,25};
		
		
		
		int sizePari = 0;
		int sizeDispari = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sizePari++;
			} else {
				sizeDispari++;
			}
		}
		
		System.out.println(sizePari);
		System.out.println(sizeDispari);
		
		
		int[] pari = new int[sizePari];
		int[] dispari = new int[sizeDispari];
		
		int x = 0;
		int y = 0; 
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			if(numbers[i] % 2 == 0) {
				pari[x] = numbers[i];
				x++;
			} else {
				dispari[y] = numbers[i];
				y++;
			}
		}
		
		int medPari = 0;
		int medDispari = 0;
		
		for (int i = 0; i < pari.length; i++) {
			medPari = medPari + pari[i];
		}
		
		for (int i = 0; i < dispari.length; i++) {
			medDispari = medDispari + dispari[i];
		}
		
		System.out.println(medPari);
		System.out.println(medDispari);
	}

}
