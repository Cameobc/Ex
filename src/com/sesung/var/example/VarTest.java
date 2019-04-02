package com.sesung.var.example;

import java.util.Scanner;

public class VarTest {
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a 값을 입력해주세요.");
		int a = sc.nextInt();
		System.out.println("b 값을 입력해주세요.");
		int b = sc.nextInt();
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = "+ (a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b의 몫 = "+(a/b));
		System.out.println("a / b의 나머지 = "+(a%b));
	}

	public void example2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 값을 입력해주세요.");
		double wide = sc.nextDouble();
		System.out.println("세로 값을 입력해주세요.");
		double height = sc.nextDouble();
		System.out.println("사각형의 면적 : " +(wide*height));
		System.out.println("사각형의 둘레 : "+((wide+height)*2));
	}
	
	public void example3() {
		String studentName = null;
		int classYear = 0;
		int classNo = 0;
		int studentNo = 0;
		String gender = null;
		float korScore = 0;
		float engScore = 0;
		float matScore = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		studentName = sc.next();
		System.out.println("Grade");
		classYear = sc.nextInt();
		System.out.println("Class");
		classNo = sc.nextInt();
		System.out.println("Number");
		studentNo = sc.nextInt();
		System.out.println("Gender(M/F)");
		gender = sc.next();
		System.out.println("점수는 소숫점 아래 첫째 자리까만 입력하세요.");
		System.out.println("Kor");
		korScore = sc.nextFloat();
		System.out.println("Eng");
		engScore = sc.nextFloat();
		System.out.println("Math");
		matScore = sc.nextFloat();
		
		float hap = matScore+engScore+korScore;
		float avg = hap/3;
		
		System.out.println("Name : " + studentName);
		System.out.println("Grade : " + classYear);
		System.out.println("Class : "+ classNo);
		System.out.println("Number : " + studentNo);
		System.out.println("Gender : " + gender);
		System.out.println("Kor : " + korScore);
		System.out.println("Eng : " + engScore);
		System.out.println("Math : "+ matScore);
		System.out.println("Total : "+ hap);
		System.out.printf("Avg : %4.1f%n", avg);
	}
	
	public void example5() {
		String no = null;
		String name = null;
		String dept = null;
		String job = null;
		int salary = 0;
		double point = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번을 입력하세요.");
		no = sc.next();
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("부서를 입력하세요.");
		dept = sc.next();
		System.out.println("직급을 입력하세요.");
		job = sc.next();
		System.out.println("급여를 입력하세요.");
		salary = sc.nextInt();
		System.out.println("보너스포인트를 입력하세요.");
		point = sc.nextDouble();
		
		int pay = (int)(salary + (salary*point))*12;
		System.out.println(dept+"부에 근무하는 "+name+" "+job+"의 "+"사번은 "+no+" 이고,"
				+ "연봉은 "+pay+" 원입니다.");
		
	
	}
}
