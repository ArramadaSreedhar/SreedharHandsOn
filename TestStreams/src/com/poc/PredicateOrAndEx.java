package com.poc;

import java.util.function.Predicate;

public class PredicateOrAndEx {

	public static Predicate<String> hasLength2=new Predicate<String>() {
		public boolean test(String t) {
			return t.length()>2;
		}
	};
	
	public static Predicate<String> containsA(){
		return x->x.contains("A");
	}
	
	public static Predicate<String> containsB=new Predicate<String>() {
		public boolean test(String a) {
			return a.contains("B");
		}
	};
	
	
	
	public static void main(String[] args) {
		// And
		System.out.println(hasLength2.and(containsB).and(containsA()).test("ABC"));
		
		//negate
		System.out.println(hasLength2.and(containsB).and(containsA()).negate().test("ABC"));
		
		//Or
		System.out.println(hasLength2.or(containsA()).test("A"));
		
		
		
		Predicate<String> lengthGt10= (i) -> i.length()>10;
		Predicate<String> eqSree= (i)-> i.equals("Sree");
		//equal
		System.out.println(lengthGt10.and(eqSree).test("Sreedhar"));
		
	}

}
