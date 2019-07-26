package com.poc;
@FunctionalInterface
interface C{
	abstract void call();
	static void test1() {
		System.out.println("C.test method");
	}
	
}

public class StaticeMethodEx implements C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StaticeMethodEx().test1();
		C.test1();
	}
	
	//default method we can override, but static method we can't override
	public void test() {
		System.out.println("StaticeMethodEx test method");
	}
	
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

}
