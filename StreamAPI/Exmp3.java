package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

// how to use reduce() method in stream
public class Exmp3 {
	
	public static void main(String[] args) {
		
		
		List<Float> list = new ArrayList<>();
		
		list.add(10f);
		list.add(10f);
		list.add(10f);
		list.add(10f);
		list.add(10f);
		
		Float total = list.stream().reduce(0.0f,(sum, num)->sum+num);
		System.out.println(total);
		
		// most convenient way by usingmethod reference
		Float total1 = list.stream().reduce(0.0f,Float::sum);
		System.out.println(total1);
		
		
	}

}
