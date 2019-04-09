package com.sesung.all.example.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
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
		int sum =0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(a);
		ar.add(b);
		Collections.sort(ar);
		for(int i=ar.get(0);i<=ar.get(1); i++) {
			sum = i+sum;
		}
		System.out.println(sum);
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
		char ch = 0;
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("학년 입력");
		int year = sc.nextInt();
		System.out.println("반 입력");
		int ban = sc.nextInt();
		System.out.println("번호 입력");
		int num = sc.nextInt();
		System.out.println("성별 입력(M/F)");
		String gender = sc.next();
		System.out.println("성적 입력");
		double sung = sc.nextDouble();
		
		char gen = gender.charAt(0);
		String result = gen=='M' ? "남학생":"여학생";
		String grade = sung>=90?"A":(sung<90 && sung>=80 ? "B":(sung<80 && sung>=70 ? "C":(sung<70 && sung>=60 ? "D":"F")));
		System.out.println(year + "학년 "+ban+"반 "+num+" 번 "+result+" "+name+"의 점수는 "+sung+"이고, "+grade+" 학점입니다.");
	}
	
	public void printStarNumber() {
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		if(a>0) {
			for(int i=0; i<a;i++) {
				for(int j=0; j<i;j++) {
					System.out.print("*");
				}
				System.out.println(i+1);
//				System.out.println();
			}
			System.out.println("===========");
		}else{
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandomNumber() {
		double  a = Math.random();
		a= a*100;
		a=Math.round(a);
		int sum=0;
		int b = (int)a;
		System.out.println(b);
		for(int i=0; i<=b; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
	
	public void continueGugudan() {
		System.out.println("정수를 입력해주세요.");
		int a = sc.nextInt();
		if(a>0) {
			for(int i=1; i<10; i++) {
				if((i%a)==0) {
					continue;
				}
				System.out.println(a+" * "+i+" = "+(a*i));
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void shutNumber() {
		boolean check = true;
		do{
			System.out.println("정수를 입력해주세요.");
			int a = sc.nextInt();
			Random random = new Random();
			int num = random.nextInt(6)+1; //플러스 1 해주는 이유는 0을 제외하기 위해서!
			int num2 = random.nextInt(6)+1;
			int sum = num+num2;
			System.out.println(sum);
			if(a==sum) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			System.out.println("계속하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("n") || answer.equals("N")) {
				System.out.println("프로그램 종료");
				check=!check;
				break;
			}
			
		}while(true);
	}
}
