package com.sesung.control.example;

import java.util.Scanner;

public class ControlTest {
	private Scanner sc;
	
	public ControlTest() {
		sc = new Scanner(System.in);
	}


	public void test1() {
		System.out.println("Kor");
		int kor = sc.nextInt();
		System.out.println("Eng");
		int eng = sc.nextInt();
		System.out.println("Math");
		int math = sc.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;
		avg = Math.round(avg);

		if(avg>=60 && kor>=40 && eng>=40 && math>=40) {
			System.out.println("Kor : "+kor);
			System.out.println("Eng : "+eng);
			System.out.println("Math : "+ math);
			System.out.println("Avg : "+avg);
		}else {
			System.out.println("불합격");
		}

	}

	public void  test2() {
		boolean check = true;
		while(check) {
			System.out.println("***초기메뉴***");
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1: System.out.println("입력메뉴가 선택되었습니다.");
			System.out.println("====================");
			break;
			case 2:System.out.println("수정메뉴가 선택되었습니다.");
			System.out.println("====================");
			break;
			case 3:System.out.println("조회메뉴가 선택되었습니다.");
			System.out.println("====================");
			break;
			case 4: System.out.println("삭제메뉴가 선택되었습니다.");
			System.out.println("====================");
			break;
			case 7: System.out.println("프로그램이 종료됩니다.");
			check=!check;
			break;
			default:
				System.out.println("번호가 잘못 입력되었습니다.");
				System.out.println("다시 입력하십시오.");
				System.out.println("====================");
			}
		}
	}
	
	public void test3() {
		int a = 0;
		System.out.println("정수 입력");
		a = sc.nextInt();
		if(a>=0) {
			System.out.println("양수");
		}else {
			System.out.println("양수가 아니다");
		}
	}
	
	public void test4() {
		int a =0;
		String str = null;
		System.out.println("정수를 입력해주세요.");
		a = sc.nextInt();
		if((a%2)==0 && a>=0) {
			str="짝수다";
		}else {
			str="홀수다";
		}
		System.out.println(str);
	}
	
	public void test5() {
		String name=null;
		int age = 0;
		double height=0;
		
		System.out.println("Name ?");
		name = sc.next();
		System.out.println("Age ?");
		age = sc.nextInt();
		System.out.println("Height ?");
		height = sc.nextDouble();
		
		if(name!=null && name.length()>0 && age>0 && height>0) {
			System.out.println("NAME : "+name);
			System.out.println("AGE : "+age);
			System.out.println("HEIGHT : "+height);
			System.out.println("Confirmed : "+name+"의 나이는"+age+"세이고, 키는 "+height+"cm 이다.");
		}else {
			System.out.println("Unknown");
		}
	}
	
	public void test6() {
		int a =0;
		int b=0;
		System.out.println("a?");
		a = sc.nextInt();
		System.out.println("b?");
		b = sc.nextInt();
		if(a>=0 && b>=0) {
			System.out.println("첫번째 정수 : "+a);
			System.out.println("두번째 정수 : "+b);
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println(a+"-"+b+"="+(a-b));
			System.out.println(a+"*"+b+"="+(a*b));
			System.out.println(a+"/"+b+"="+(a/b));
			System.out.println(a+"%"+b+"="+(a%b));
		}
	}
	
	public void test7() {
		int a = 0;
		char ch= 'a';
		System.out.println("SCORE ?");
		a = sc.nextInt();
		
		if(a>=90) {
			ch='A';
		}
		if(a>=80 && a<90) {
			ch='B';
		}
		if(a>=70&&a<80) {
			ch='C';
		}
		if(a>=60 && a<70) {
			ch = 'D';
		}
		if(a<60 && a>0) {
			ch= 'F';
		}
		System.out.println("SCORE : "+a+"  GRAGE : "+ch);
	}
}
