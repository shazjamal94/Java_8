package com.java8.functionalInterface;

import java.util.function.Predicate;

//It is a functional interface which represents a predicate (boolean-valued function) of one argument. It is defined in the java.util.function package and contains test() a functional method.
public class PredicateExp {
	
	static Boolean checkAge(int age) {
		
		if(age>=18)
			 return true;
		
		return false;
	}
	

	public static void main(String[] args) {
		
		Predicate<Integer> p = PredicateExp::checkAge;
		System.out.println(p.test(17));
		
			
		
		
	}

}
