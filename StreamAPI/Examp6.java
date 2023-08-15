package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ListProduct{  
    int id;  
    String name;  
    float price;  
    public ListProduct(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Examp6 {
	
	public static void main(String[] args) {
		
		
		// convert list into map;
		
		List<ListProduct> list =  new ArrayList<>();
		
		list.add(new ListProduct(1, "samsung", 25000));
		list.add(new ListProduct(2, "iphone", 30000));
		list.add(new ListProduct(3, "vivo", 20000));
		
		Map<String,Float> map = list.stream().filter(p->p.price>20000).collect(Collectors.toMap(p->p.name,p->p.price));
		for(Map.Entry<String,Float> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + " "+ entry.getValue());
			
		}
		
		
	}

}
