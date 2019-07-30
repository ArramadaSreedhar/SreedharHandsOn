package com.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.test.Emp;

public class OrElseExamaple {
	
	public Emp getVal(int i)
	{
		if(i==0) {
			return null;
		}else {
			return new Emp(1,"Sreedhar");
		}
	}
	
	static String B() {
	    System.out.println("B()...");
	    return "B";
	}
	
	static String A() {
		System.out.println("A()....");
		return "A";
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * OFNULL
		 */
		//Optional of call the both methods, regardless Optional is present or not. It's expensive.
		System.out.println(Optional.of(A()).orElse(B()));
		
		//Only Optional is not present then only B() will call. 
		System.out.println(Optional.of(A()).orElseGet(() -> B()));
		
		/*
		 * OF NULLABLE
		 */
		
		//Here getVal method return null value, then only orElse returns object.
		Emp empOpt=Optional.ofNullable(new OrElseExamaple().getVal(1)).orElse(new Emp(2,"Sreekanth"));
		System.out.println(empOpt.getName());
	
		//OrElseGet usage- If the value returns null, then supplier code will execute
		Emp empOpt1=Optional.ofNullable(new OrElseExamaple().getVal(0)).orElseGet(()->{
			System.out.println("getVal method returns null value");
			return new Emp(2,"Sreenath");});
		System.out.println(empOpt1.getName());
		
		
		
		String samp=new String("Hari");
		System.out.println(Optional.ofNullable(samp).orElse("Sree"));
		System.out.println(Optional.of(samp).orElse(A()));
		
		//Optional.ofNullable(samp).orElseGet("")
		
		Emp emp1=null;
		Optional<Emp> empOpt3=Optional.ofNullable(emp1);
		if(empOpt3.isPresent()) {
			System.out.println("Emp Object is present");
		}else {
			System.out.println("Emp Object is not present");
		}
			
		
		
	}

}
