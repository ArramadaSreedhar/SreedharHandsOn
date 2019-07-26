package com.test;

public class SingletonEx {
	private static Emp e=getEmployee();
	
	private SingletonEx() {
		
	}
	
	public static Emp getEmployee() {
	synchronized(SingletonEx.class){//For Double check locking.
		if(e==null) {
			synchronized(SingletonEx.class) {//Race condition.
				e=new Emp();
			}
		}
		}
			return e;
		
	}
	
	public Emp getValue() {
		return e;
	}
	
}
