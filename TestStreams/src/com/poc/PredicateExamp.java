package com.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.test.Emp;

class Predicates{
	public static Predicate<Emp> isManager(){
		return p->p.getSal()>3000;
	}
	
	public static Predicate<Emp> startsWithA(){
		return p->p.getName().startsWith("A");
				
	}
}

public class PredicateExamp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(101,"Sree",0);
		Emp e2=new Emp(201,"krishna",2300);
		Emp e3=new Emp(301,"Aravind",4300);
		Emp e4=new Emp(401,"Akash",5400);
		Emp e5=new Emp(501,"Manu",6400);
		

	
	List<Emp> al=new ArrayList();
	al.add(e1);al.add(e2);al.add(e3);al.add(e4);al.add(e5);
	

	
	
	al.stream().filter(Predicates.isManager()).forEach(x->{
		System.out.println(x.getName());
	});
	
	
	System.out.println("Name's start with A character");
	al.stream().filter(Predicates.startsWithA()).forEach(x->{
		System.out.println(x.getName());
	});
	
	
	
	
	//opt2.isPresent();
	//opt2.get();
	
	
	}

}
