package com.poc;

import java.util.LinkedList;
import java.util.List;

public class LinkedParallelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll=new LinkedList();
		ll.add("B");
		ll.add("A");
		ll.add("R");
		ll.add("C");
		ll.add("D");
		
		ll.stream().forEach(x->{
			System.out.println(x);
		});
		
		//parallell steam not giving the elements in order
		ll.parallelStream().forEach(x->{
			System.out.println(x);
		});
		
	} 

}
