package com.google.io.file.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	private MemberInfo mi;
	private MemberView mv;
	private MemberAdd ma;

	public MemberController(){
		mi= new MemberInfo();
		mv = new MemberView();
		ma = new MemberAdd();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> ar = new ArrayList<Member>();
		boolean check = true;
		while(check) {
			
			System.out.println("1.멤버정보 받아오기");
			System.out.println("2.멤버정보 입력하기");
			System.out.println("3.멤버정보 전체출력");
			System.out.println("4.멤버정보 검색출력");
			System.out.println("5.그룹검색 추가하기");
			System.out.println("6.멤버정보 백업하기");
			System.out.println("7.프로그램 종료하기");
			int select = sc.nextInt();
			switch(select) {
			case 1: ar = mi.MemberInit();
			break;
			case 2:
				Member member = ma.memberAdd();
				ar.add(member);
				break;
			case 3: mv.view(ar);
			break;
			case 4:
				break;
			case 5: 
				break;
			case 6:
				break;
			case 7:
				check=!check;
				break;
			default:
				System.out.println("잘못 입력했습니다.");

			}
		}
	}

}
