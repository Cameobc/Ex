package com.sesung.control.example;

import java.util.Scanner;

public class ControlTest {


	public void test1() {
		Scanner sc = new Scanner(System.in);
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
		Scanner sc = new Scanner(System.in);
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
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		a = sc.nextInt();
		if(a>=0) {
			System.out.println("양수");
		}else {
			System.out.println("양수가 아니다");
		}
	}
}
