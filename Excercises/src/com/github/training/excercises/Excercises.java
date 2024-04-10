package com.github.training.excercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.github.training.excercises.bean.Dog;
import com.github.training.excercises.service.EserciziService;

public class Excercises {

	public static void main(String[] args) {
		
		//example();
		//exampleSwitchCase();
		//callListMethods();
		esercizioA();
	}

	private static void example() {
		Scanner input = new Scanner(System.in);
		int number = 0;
		String result = null;
		Dog myDog = new Dog();
		int[] numbers = new int[5];
		String resultforEach;
		
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
		
		for (int num : numbers) {
			resultforEach = (num % 2 == 0) ? "pari" : "dispari";
			System.out.println(num + " è un numero " + resultforEach);
		}
		
		input.close();
		System.out.print("Fine Programma");
	}
	
	private static void exampleSwitchCase() {
		Scanner input = new Scanner(System.in);
		int number = 0;
		String result = null;
		
		System.out.print("Digitare un numero compreso tra 1 e 10 ");
		number = input.nextInt();
		
		switch (number) {
		case 1: 
			result = "uno";
			break;
		case 2: 
			result = "due";
			break;
		case 3: 
			result = "tre";
			break;
		case 4: 
			result = "quattro";
			break;
		case 5: 
			result = "cinque";
			break;
		case 6: 
			result = "sei";
			break;
		case 7: 
			result = "sette";
			break;
		case 8: 
			result = "otto";
			break;
		case 9: 
			result = "nove";
			break;
		case 10: 
			result = "dieci";
			break;
		default: 
			result = "Non previsto";
		}
		
		input.close();
		System.out.println("Il numero inserito è " + result);
		
	}
	
	private static void callListMethods() {
		EserciziService service = new EserciziService();
		//service.stampaLista();
		//service.stampaListaUtils();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il nome della stagione in inglsse: ");
		String season = input.next();
		service.stampaListaModificata(season);
		
		input.close();
		
		
	}

	/*
	 * 1)Prendere in input una lista di valori interi positivi fino a quando l'utente digita 0; 
	 * 2)Verificare che ogni valore sia un numero positivo, bloccare l'esecuzione in caso contrario e stampare "Non sono ammessi valori negativi"; 
	 * 3)Contare per ogni valore il numero di occorrenze nella lista
	 */
	
	private static void esercizioA() {
		
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		List<Integer> values = new ArrayList<Integer>();
		
		System.out.println("Inserire una serie di numeri, digitare 0 per terminare: ");
		int value = scan.nextInt();
		
		while(value != 0) {
			if(value > 0) {
				values.add(value);
				value = scan.nextInt();
			} else {
				System.out.println("Non sono ammessi valori negativi");
				break;
			}
			
			
		}
		
		for(int i=0; i<values.size(); i++) {
			
			for(int j=0; j<values.size(); j++ ) {
				
				if(values.get(i) == values.get(j)) {
					
					count++;
					
				} 
				
			}
			System.out.println("Ci sono in totale " + count + " occorrenze del valore " + values.get(i) + " nella lista." );
			count = 0;
		}
		
		System.out.println("Fine programma ");
	
		
	}

	
}
