package com.sesung.operator.example;

import java.util.Scanner;

public class OperatorTest1 {
	public static void main(String[] args) {
		
		int a =10, b=20;
		System.out.printf("[%d]\n", a>b? 1:0);
		
		a=20; b=10;
		System.out.printf("[%d]", a>b ? 1:0);
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int num = sc.nextInt();
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		
		int Max = num> num2 ? num:num2;
		int Min = num<num2 ? num:num2;
		System.out.println("최소값은 : "+Min);
		System.out.println("최댓값은 : "+Max);
		
//		int a =50;
//		int b = 60;
//		int result = Math.max(a, b);
//		System.out.println("최댓값은" + result +"입니다.");
//	}
//	
//	static int max(int a, int b) {
//		int result = (a>b)? a:b;
//		return result;
	}
}
