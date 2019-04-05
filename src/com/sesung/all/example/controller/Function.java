package com.sesung.all.example.controller;

import java.util.Scanner;

public class Function {
	Scanner sc;
	
	public Function() {
		sc = new Scanner(System.in);
	}

	public void calculator() {
		int a = 0;
		int b = 0;
//		char ch = 0;
		System.out.println("정수 a 입력");
		a = sc.nextInt();
		System.out.println("정수 b 입력");
		b = sc.nextInt();
		System.out.println("연산자를 입력하세요.(+,-,x,/)");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println("================");
			break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			System.out.println("================");
			break;
		case 'X' :
			System.out.println(a+"X"+b+"="+(a*b));
			System.out.println("================");
			break;
		case 'x' :
			System.out.println(a+"x"+b+"="+(a*b));
			System.out.println("================");
			break;
		case '/' :
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.out.println(a+"/"+b+"="+"0");
				System.out.println("================");
			}else {
				System.out.println(a+"/"+b+"="+(a/b));
				System.out.println("================");
			}
		default:
		}
	}
	
	public void totalCalculator() {
		
		System.out.println("정수 A를 입력하세요");
		int a = sc.nextInt();
		System.out.println("정수 B를 입력하세요");
		int b = sc.nextInt();
		
		
	}
	
	public void profile() {
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		System.out.println("성별 입력");
		String gender = sc.next();
		System.out.println("성격 입력");
		String cha = sc.next();
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		System.out.println("성격 : "+cha);
		System.out.println("================");
		
	}
	
	public void sungjuk() {
		
	}
	
	public void printStarNumber() {
		
	}
	
	public void sumRandomNumber() {
		
	}
	
	public void continueGugudan() {
		
	}
}
