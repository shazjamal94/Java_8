package com.java8.methodreference;

interface Refer{
	
	 void print();
		
		
	
	
}


public class MethodReference {
	
	public static void printSomething() {
		
		
		
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
	 	Refer refer = MethodReference::printSomething;
	 	refer.print();
	 

		}
 

	
		
		
	

}
