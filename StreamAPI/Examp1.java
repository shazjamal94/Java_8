package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
*Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
*Stream is lazy and evaluates code only when required.
*The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source. 
 */
public class Examp1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		list.add(3);
		
		list.add(4);
		
		list.add(5);
		
		
		int count = (int) list.stream().count();
		
		System.out.println(count);
		System.out.println("above code for count no of elements");
		list.stream().forEach(each->{
			System.out.println(each);
			
		});
		
		
		
		
	}

}
