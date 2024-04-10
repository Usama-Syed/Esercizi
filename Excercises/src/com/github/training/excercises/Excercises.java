package com.github.training.excercises;

import java.util.Scanner;

import com.github.training.excercises.bean.Dog;
import com.github.training.excercises.service.EserciziService;

public class Excercises {

	public static void main(String[] args) {
		
		//example();
		//exampleSwitchCase();
		callListMethods();
		
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
}
