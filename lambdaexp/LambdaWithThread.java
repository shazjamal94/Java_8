package com.java8.lambdaexp;

public class LambdaWithThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// thread with out lambda
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
			
				System.out.println("thread in running");
				
			}
		};
      
		Thread t = new Thread(r);
		t.start();
		
		// thread with lambda
		
		Runnable r1 = ()->{
			
			System.out.println("thread in running using lambda");
			
		};
		Thread t1 = new Thread(r1);
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getThreadGroup());
		System.out.println(t1.getId());
		System.out.println(t.getName());
		System.out.println(t.isDaemon());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getId());
		t1.start();
	}

}
