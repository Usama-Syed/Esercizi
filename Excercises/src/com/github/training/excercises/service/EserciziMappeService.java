package com.github.training.excercises.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EserciziMappeService {
		
	private Map<Integer, String> createMap() {
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		return myMap;
	}
	
	private void populateMap(Map<Integer, String> numbers) {
		numbers.put(1, "UNO");
		numbers.put(2, "DUE");
		numbers.put(3, "TRE");
		numbers.put(4, "QUATTRO");
		
		numbers.put(2, "CINQUE");
		numbers.put(2, "SEI");
		numbers.put(10, "ZZZZ");
		
	}
	
	public String getValue(int key) {
		Map<Integer, String> numbers = createMap();
		populateMap(numbers);
		
		return numbers.get(key);
	}
	
	public void printMap() {
		Map<Integer, String> numbers = createMap();
		populateMap(numbers);
		
		System.out.println("Lista Chiave - Valore Mappa: ");
		
		for (int key : numbers.keySet()) {
			String value = numbers.get(key);
			System.out.println(key + " - " + value);
		}
		
		List<String> values = new ArrayList<String>(numbers.values());
		
		String max = "";
		
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i).compareTo(max) > 0) {
				max = values.get(i);
			}
		}
		
		System.out.println("Il valore massimo della mappa è: " + max);
		
	}
	
}
