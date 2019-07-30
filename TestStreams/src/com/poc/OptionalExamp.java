package com.poc;

import java.util.Optional;

import com.test.Emp;

public class OptionalExamp {


	public Emp check(Emp e) {
		if(e.getSal()>0) {
			return e;
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1=new Emp(101,"Sree",0);
		
		
		//Before using optional
		Emp	e6=new OptionalExamp().check(e1);
		System.out.println(e6);
		
		//Using Optional
		Optional<Emp> e7=Optional.ofNullable(new OptionalExamp().check(e1));
		System.out.println(e7.isPresent());
		
		//Declare a empty object without using null
		Optional<Emp> e2=Optional.empty();
		System.out.println("E2 before assigning Value:"+e2.isPresent());
		e2=Optional.of(new Emp(102,"krish",10));
		System.out.println("E2 after assigning value:"+e2.isPresent());
		System.out.println(e2.get().getName());
		
		
		System.out.println(Optional.ofNullable(null).isPresent());
		
		//null value not acceptable for Of method.
		//System.out.println(Optional.of(null).isPresent());
		
		
	}

}
