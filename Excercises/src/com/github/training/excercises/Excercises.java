package com.github.training.excercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

import com.github.training.excercises.bean.Dog;
import com.github.training.excercises.service.EserciziListeService;
import com.github.training.excercises.service.EserciziMappeService;
import com.github.training.excercises.service.EserciziSetService;

public class Excercises {

	public static void main(String[] args) {
		
		//example();
		//exampleSwitchCase();
		//callListMethods();
		//callMapExcercises();
		//callSetExcercises();
		handleExceptions();
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
		EserciziListeService service = new EserciziListeService();
		//service.stampaLista();
		//service.stampaListaUtils();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il nome della stagione in inglsse: ");
		String season = input.next();
		service.stampaListaModificata(season);
		
		input.close();
	}
	

	private static void callMapExcercises() {
		EserciziMappeService maps = new EserciziMappeService();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire il numero da trascodificare: ");
		int num = input.nextInt();
		String result;
		
		result = maps.getValue(num);
		
		System.out.println("Il valore corrispondente è " + result);
		
		maps.printMap();
		input.close();
	}
	
	private static void callSetExcercises() {
		EserciziSetService service = new EserciziSetService();
		Scanner input = new Scanner(System.in);
		String result = "";
		Integer[] array = new Integer[]{1, 5, 7, 1, 6, 8, 7 };
		Set<Integer> values = service.generateSet(Arrays.asList(array));
		System.out.println("Lunghezza array originale: " + array.length);
		int oldSize = values.size();
		System.out.println("Lunghezza set creato: " + oldSize);
		
		System.out.println("Lista Valori Nel Set Di Partenza");
		for (Integer value : values) {
			System.out.println(value);
		}
		
		values.add(7);
		values.add(2);
		
		System.out.println("Lunghezza set modificato: " + values.size());
		System.out.println("Lunghezza set modificato attesa: " + (oldSize + 1));
		
		System.out.println("Lista Valori Nel Set Modificato");
		for (Integer value : values) {
			System.out.println(value);
		}
		
		System.out.println("Digitare il valore di cui controllare la presenza nel set ");
		int number = input.nextInt();
		boolean esito = service.isContained(values, number);
		if (!esito) {
			result = "non";
		}
		System.out.println("Il valore " + number + " " + result + " è presente nel set");
		
		System.out.println("Digitare il valore della posizione da ricercare nel set ");
		number = input.nextInt();
		int element = service.getElement(values, number - 1);
		System.out.println("Il valore corrispondente alla posizione " + number + " è " + element);
		
		//Iterator part
		service.removeElementIterator(values, 5);
		System.out.println("Lunghezza set finale: " + values.size());
		
		System.out.println("Lista Valori Nel Set Finale");
		for (Integer value : values) {
			System.out.println(value);
		}
		
		System.out.println("Digitare il nuovo valore della posizione da ricercare nel set ");
		number = input.nextInt();
		element = service.getElementIterator(values, number - 1);
		System.out.println("Il valore corrispondente alla posizione " + number + " è " + element);
		
		input.close();
	}
	
	public static void handleExceptions() {
		Integer[] numbers = new Integer[]{1, 5, 7, 8};
		String result = null;
		int number, value = 0; 
		Dog myDog = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire il numero della posizione da ricercare: ");
		number = input.nextInt();
		
		try {
			value = numbers[number-1];
			myDog.equals(null);
			result = "Il valore corrispondente alla posizione " + number + " è " + value;
		} catch (ArrayIndexOutOfBoundsException aex) {
			System.out.println("Error Message: " + aex.getMessage());
			result = "La poszione non è presente nella lista, la lista contiene " + numbers.length + " elementi";
		} catch (NullPointerException nex) {
			result = "Il valore corrispondente alla posizione " + number + " è " + value;
			System.out.println("Error Message: " + nex.getMessage());
		}
		
		System.out.println(result);
		
		input.close();
	}
	

}
