/**
 * 
 */
package com.java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class Examp5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		
		int max = list1.stream().max((a,b)->a.compareTo(b)).get();
		int min = list1.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(min);
		System.out.println(max);
		
		int max1 = list1.stream().max((a,b)->a>b?1:-1).get();
		System.out.println(max1);
		
	}

}
