package com.poc;

import java.util.ArrayList;
import java.util.List;

import com.test.Emp;

public class StreamExceptionHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Emp e1=new Emp(101,"Sree",0);
		Emp e2=new Emp(201,"krishna",2300);
		Emp e3=new Emp(301,"Aravind",4300);
		Emp e4=new Emp(401,"Aravind",5400);
		Emp e5=new Emp(501,"Aravind",6400);
		
		List<Emp> al=new ArrayList();
		al.add(e1);al.add(e2);al.add(e3);al.add(e4);al.add(e5);
		
		//Exception handling in streams
		al.stream().map(x->except(x)).forEach(x->{
			System.out.println(x.getName()+"---"+x.getSal());
		});
		
		//Increase Salary with the external method in streams.
		al.stream().map(x->increaseSal(x)).forEach(x->{
			System.out.println(x.getName()+"---"+x.getSal());
		});
		
		

		
		
		
		
	}
	
	public static Emp except(Emp emp) {
		try {
			int half=2/emp.getSal();
		emp.setSal(half);
		}catch(Exception e) {
			System.out.println(e);
		}
		return emp;
	}
	
	
	public static Emp increaseSal(Emp emp) {
		System.out.println();
		emp.setSal(emp.getSal()+100);
		return emp;
	}

}
