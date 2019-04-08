package com.sesung.operator.example;

import java.util.Scanner;

public class OperatorTest {

	public void sample1() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Kor");
		kor = sc.nextInt();
		System.out.println("Eng");
		eng = sc.nextInt();
		System.out.println("Math");
		math = sc.nextInt();
		total = kor+eng+math;
		avg = total/3.0;
		
		String result = kor>=40 && eng>=40 && math>=40 && avg>=60 ? "합격":"불합격";
		System.out.println(result);
		
//		if(kor>=40 && eng>=0 && math>=40 && avg>=60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
	}

	public void sample2() {
		String name = null;
		int grade = 0;
		int cla = 0;
		int num = 0;
		String gender = null;
		double total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("학년 입력");
		grade = sc.nextInt();
		System.out.println("반 입력");
		cla = sc.nextInt();
		System.out.println("번호 입력");
		num = sc.nextInt();
		System.out.println("성별 입력(M/F)");
		gender = sc.next();
		System.out.println("성적 입력");
		total = sc.nextDouble();

		char a = gender.charAt(0);

		String result = a=='M' ? "남학생":"여학생";
		System.out.println(grade +"학년 "+cla+"반 "+num+"번 "+result+" "+name+"은 성적이 "+total+"이다.");
//		if(a=='M') {
//			System.out.println(grade +"학년 "+cla+"반 "+num+"번 남학생 "+name+"은 성적이 "+total+"이다.");
//		}else {
//			System.out.println(grade +"학년 "+cla+"반 "+num+"번 여학생 "+name+"은 성적이 "+total+"이다.");
//		}

	}

	public void sample3(){
		int a =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		a = sc.nextInt();
		
		String result = a>=0 ? "양수다":"양수가 아니다";
		System.out.println(result);
		
		
//		if(a>0) {
//			System.out.println("양수다");
//		}else if(a<0){
//			System.out.println("양수가 아니다.");
//		}else {
//		}

	}

	public void sample4(){
		int a =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		a = sc.nextInt();
		String result = (a%2)==0? "짝수다":"홀수다";
//		if((a%2)==0) {
//			result="짝수다";
//		}else {
//			result="홀수다";
//		}
		System.out.println(result);

	}
	
	public void sample5(){
		int kor =0;
		int eng =0;
		int math =0;
		int total=0;
		double avg =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kor");
		kor = sc.nextInt();
		System.out.println("Eng");
		eng = sc.nextInt();
		System.out.println("Math");
		math = sc.nextInt();
		total = kor+eng+math;
		avg = total/3.0;
		
		char result = avg>=90 ? 'A':(avg<90 && avg>=80 ? 'B':(avg<80 && avg>=70? 'C':(avg<70 && avg>=60?'D':'F')));
		System.out.println(result);
		
//		if(avg>=90) {
//			System.out.println('A');
//		}else if(avg>=80) {
//			System.out.println('B');
//		}else if(avg>=70) {
//			System.out.println('C');
//		}else if(avg>=60) {
//			System.out.println('D');
//		}else {
//			System.out.println('F');
//		}
		
		
	}

}
