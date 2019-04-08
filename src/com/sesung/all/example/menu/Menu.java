package com.sesung.all.example.menu;

import java.util.Scanner;

import com.sesung.all.example.controller.Function;

public class Menu {
	
	public static void  displayMenu(){
		Scanner sc = new Scanner(System.in);
		Function function = new Function();
		boolean check = true;
		do {
		System.out.println("번호 입력");
		System.out.println("1.간단 계산기");
		System.out.println("2.작은수에서 큰 수까지 합계 구하기");
		System.out.println("3.신상정보 확인");
		System.out.println("4.학생정보 확인");
		System.out.println("5.별과 숫자 출력");
		System.out.println("6.난수까지의 합계 구하기");
		System.out.println("7.구구단");
		System.out.println("8.주사위 숫자 알아맞추기 게임");
		System.out.println("9.프로그램 종료");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			function.calculator();
			break;
		case 2:function.totalCalculator();
			break;
		case 3:function.profile();
			break;
		case 4:function.sungjuk();
			break;
		case 5:function.printStarNumber();
			break;
		case 6:function.sumRandomNumber();
			break;
		case 7:function.continueGugudan();
			break;
		case 8:
			
			break;
		case 9:
			System.out.println("프로그램 종료");
			check=!check;
			break;
			default:
				System.out.println("잘못 입력했습니다.");
		}
	}while(check);
	}
	
}
