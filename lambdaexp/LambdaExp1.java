package com.java8.lambdaexp;

@FunctionalInterface
interface mobile{
	
	void run();
}

public class LambdaExp1 {

	public static void main(String[] args) {
		
		mobile m = new mobile() {
			
			@Override
			public void run() {
			
				System.out.println("hello with out lambda");
			}
		};
		m.run();
		
		// with lambda
		
		mobile m1 =() ->{
			
			System.out.println("hello with  lambda");
			
		};
  m1.run();
	}

}
