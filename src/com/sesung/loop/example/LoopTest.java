package com.sesung.loop.example;

import java.util.Scanner;

public class LoopTest {
	private Scanner sc;
	
	public LoopTest() {
		sc = new Scanner(System.in);
	}
	
	public void printStar1() {
		System.out.println("정수를 입력해주세요.");
		int star = sc.nextInt();
		if(star>0) {
			for(int i=0; i<star; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println(i+1);
			}
			System.out.println("=================");
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void printStar2() {
		System.out.println("정수를 입력해주세요.");
		int star = sc.nextInt();
		if(star>0) {
			for(int i=0;i<star; i++) {
				for(int j=0;j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("===============");
		}else if(star<0) {
			for(int i =star; i<0;i++) {
				for(int j=0; j>i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("===============");
		}else {
			System.out.println("출력 기능이 없습니다.");
		}
		
	}
}
