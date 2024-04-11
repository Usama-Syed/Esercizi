package com.github.training.excercises.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.github.training.excercises.bean.StringListBean;

public class EserciziListeService {
	
	/*
	 * Creare una lista che contiene i nomi dei giorni della settimana e stamparla
	 */
	public void stampaLista() {
		List<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		for (int i = 0; i < days.size(); i++) {
			System.out.println("Day " + (i+1) + " of the week is " + days.get(i));
		}
		
	}
	
	/*
	 * Creare una lista che contiene i nomi dei giorni della settimana e stamparla utlizzando i metodi formati
	 */
	public void stampaListaUtils() {
		StringListBean.createList();
		StringListBean.addValue("Monday");
		StringListBean.addValue("Tuesday");
		StringListBean.addValue("Wednesday");
		StringListBean.addValue("Thursday");
		StringListBean.addValue("Friday");
		StringListBean.addValue("Saturday");
		StringListBean.addValue("Sunday");
		
		for (int i = 0; i < StringListBean.listSize(); i++) {
			System.out.println("Day " + (i+1) + " of the week is " + StringListBean.getValue(i));
		}
		
	}
	
	/*
	 * Creare una lista che contiene i nomi di cinque frutti che cambiano a seconda della stagione
	 */
	public void stampaListaModificata(String season) {
		String [] fruitsarray = new String[]{"Arancia", "Mela", "Pera", "Anguria", "Fragola", "Pesca"};
		List<String> fruits = new ArrayList<String>(Arrays.asList(fruitsarray));
		String result = null;
		
		//System.out.println(fruits);
		
		if ("SPRING".equalsIgnoreCase(season)) {
			fruits.set(0, "Arancia");
			fruits.set(1, "Fragola");
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
		} else if ("SUMMER".equalsIgnoreCase(season)) {
			fruits.set(0, "Anguria");
			fruits.set(1, "Pesca");
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
		} else if ("AUTUMN".equalsIgnoreCase(season)) {
			fruits.set(0, "Mela");
			fruits.set(1, "Pera");
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
		} else if ("WINTER".equalsIgnoreCase(season)) {
			fruits.set(0, "Arancia");
			fruits.set(1, "Mela");
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
			fruits.remove(2);
		} else {
			result = "La stagione inserita non è valida, riprovare!";
		}
		
		System.out.println("Season: " + season);
		
		if (result == null) {
			for (String fruit : fruits) {
				System.out.println(fruit);
			}
		} else {
			System.out.println(result);
		}
		
	}

}
