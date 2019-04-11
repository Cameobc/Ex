package com.google.io.file.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberAdd {
	
	public void memberBackup(ArrayList<Member> ar) {
		File file = new File("c:\\test", "test.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, false);
			fw.write("start");
			fw.write("\r\n");
			fw.flush();
			for(Member m :ar) {
				fw.write(m.getGuild());
				fw.write("-");
				fw.write(m.getName());
				fw.write("-");
				fw.write(m.getAge()+"");
				fw.write("-");
				fw.write(m.getGrade());
				fw.write("-");
				fw.write(m.getType());
				fw.write("\r\n");
				fw.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
