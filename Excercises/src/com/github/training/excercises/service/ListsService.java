package com.github.training.excercises.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsService {
	
	private static List<String> myList;
	
	public static void createList() {
		myList = new ArrayList<String>();
	}
	
	public static void createList(List<String> input) {
		myList = new ArrayList<String>(input);
	}
	
	public static void createList(String[] input) {
		myList = new ArrayList<String>(Arrays.asList(input));
	}
	
	public static void addValue(String value) {
		if (myList == null) {
			createList();
		}
		
		myList.add(value);
	}
	
	public static void getValue(int index) {
		myList.get(index);
	}
	
	public static void removeValue(int index) {
		myList.remove(index);
	}

	public static void setValue(int index, String value) {
		myList.set(index, value);
	}
	
	public static void emptyList() {
		myList.clear();
	}
	
	public static int listSize() {
		return myList.size();
	}
	
	public static int getPosition(String value) {
		int index = -1;
		for (int i = 0; i < myList.size(); i++) {
			if (value.equals(myList.get(i))) {
				index = i;
				break;
			}
		}
		
		return index;
	}

}
