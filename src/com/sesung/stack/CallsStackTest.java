package com.sesung.stack;

public class CallsStackTest {
	public static void main(String[] args) {
		firstMehtod();
		
	}
	static void firstMehtod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
