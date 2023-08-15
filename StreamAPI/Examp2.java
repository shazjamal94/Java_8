package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    double price;  
    public Product(int id, String name, double price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Examp2 {

	public static void main(String[] args) {
		
		
		List<Product> p = new ArrayList<>();
		p.add(new Product(1, "Samsung", 18000.978));
		p.add(new Product(2, "Iphone", 25000.987));
		p.add(new Product(3, "Vivo", 15000.908));
		
		
		List<Double> list = p.stream().filter(f->f.price>16000).map(f->f.price).collect(Collectors.toList());
			
		System.out.println(list);
			
	    Stream.iterate(1, i->i+1)  
        .filter(i->i%2==0)  
        .limit(5)  
        .forEach(System.out::println);  
    }  
			

		
		
	}


