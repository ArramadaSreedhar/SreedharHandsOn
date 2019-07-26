package com.poc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.test.Comodities;
import com.test.Room;

public class PredicateExampTwo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Room> roomLst=new ArrayList();
		
		Room r1=new Room();
		List<Comodities> comLst1=new ArrayList();
		List<Comodities> comLst2=new ArrayList();
		Comodities c1=new Comodities();
		c1.setIp("A");
		c1.setName("Akash");
		comLst1.add(c1);
		
		Comodities c2=new Comodities();
		c2.setIp("B");
		comLst1.add(c2);
		
		Comodities c3=new Comodities();
		c3.setIp("C");
		comLst1.add(c3);
		
		r1.setComLst(comLst1);
		
		Room r2=new Room();
		Comodities c4=new Comodities();
		c4.setIp("D");
		comLst2.add(c4);
		
		Comodities c5=new Comodities();
		c5.setIp("E");
		comLst2.add(c5);
		
		Comodities c6=new Comodities();
		c6.setIp("F");
		comLst2.add(c6);
		r2.setComLst(comLst2);
		
		roomLst.add(r1);
		roomLst.add(r2);
		
		//roomLst.stream().filter(x->x.getComLst().stream().filter(y->y.getIp().equals("A")).allma)
		roomLst.stream().flatMap(x->x.getComLst().stream()).filter(x->x.getIp().equals("A")).map(x->x.getName()).forEach(x->{
			System.out.println(x);
		});
	}

}
