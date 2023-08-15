package com.java8.functionalInterface;

import java.util.function.BiConsumer;


// BiConsumer Interface accepts two input arguments and does not return any result.
//It has method -> void accept(T t, U u)	It performs this operation on the given arguments.
public class BiConsumers {
	
    static void ShowDetails(String name, String dept){  
        System.out.println(name+" "+dept);  
    }  

	public static void main(String[] args) {
		
	 // using Method reference 
	 BiConsumer<String, String> bi = BiConsumers::ShowDetails;
	 bi.accept("shaz", "cse");
	 bi.accept("rahul", "it");

	 bi.accept("abishek", "civil");

     // using lambda 
	 BiConsumer<String, String> b = (name,dept)->{
		 
		  System.out.println(name+" "+dept+" with lambda ");  
		 
	 };
	 
	 b.accept("virat", "ece");
		
	}

}
