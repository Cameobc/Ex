package com.google.io.file.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberAdd {
	
	public void memberBackup() {
		ArrayList<Member> ar = new ArrayList<Member>();
		File file = new File("c:\\test", "test.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for(Member m :ar) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public Member memberAdd() {
		Member member = new Member();
		Scanner sc = new Scanner(System.in);
		System.out.println("Guild");
		member.setGuild(sc.next());
		System.out.println("Name?");
		member.setName(sc.next());
		System.out.println("Age?");
		member.setAge(sc.nextInt());
		System.out.println("Grade?");
		member.setGrade(sc.next());
		System.out.println("Type?");
		member.setType(sc.next());
		return member;
	}

}
