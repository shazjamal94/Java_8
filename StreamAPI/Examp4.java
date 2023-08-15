package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examp4 {
	
	
	public static void main(String[] args) {
		
List<Float> list = new ArrayList<>();
		
		list.add(90f);
		list.add(10f);
		list.add(10f);
		list.add(10f);
		list.add(10f);
		
		Double collect = list.stream().collect(Collectors.summingDouble(Float::floatValue));
		System.out.println(collect);
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = list1.stream()
		  .mapToInt(Integer::intValue)
		  .sum();
		System.out.println(sum);
		
	}

}
