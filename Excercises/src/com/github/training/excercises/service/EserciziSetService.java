package com.github.training.excercises.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EserciziSetService {
	
	public Set<Integer> generateSet(List<Integer> input) {
		Set<Integer> mySet;
		mySet = new HashSet<Integer>(input);
		//mySet.addAll(input);
		
		return mySet;
	}
	
	public void addElement(Set<Integer> set, Integer num) {
		set.add(num);
	}
	
	public Integer getElement(Set<Integer> set, int index) {
		Integer result = null;
		int i = 0;
		
		for(Integer number : set) {
			if (i == index) {
				result = number;
			}
			i++;
		}
		
		return result;
	}
	
	public boolean isContained(Set<Integer> set, Integer num) {
		return set.contains(num);
	}
	
	public boolean isContainedLoop(Set<Integer> set, Integer num) {
		boolean esito = false;
		
		for (Integer number : set) {
			if (number.intValue() == num.intValue()) {
				esito = true;
			}
		}
		
		return esito;
	}
	
	

}
