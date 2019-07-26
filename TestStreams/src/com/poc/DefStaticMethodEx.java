package com.poc;

@FunctionalInterface
interface A{
	public abstract void test();
	
	default void call() {
		System.out.println("A.Call method");
	}
}

@FunctionalInterface
interface B{
	public abstract void test();
	default void call() {
		System.out.println("B.Call method");
	}
	
}
//Interfaces support multiple inheritance, after introducing default methods
//there is a chance of diamond problem, to solve this, class must override common method. If class want to call default method 
//It may use super keyword.
public class DefStaticMethodEx implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new DefStaticMethodEx();
		a.call();
		
	
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		A.super.call();
		B.super.call();
		System.out.println("DefStaticMethodEx.call method");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
