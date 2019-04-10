package com.google.io.file.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberInfo {
	
	public ArrayList<Member> MemberInit(){
		File file = new File("c:\\test", "test.txt");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<Member> ar = new ArrayList<Member>();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			br.readLine();
			boolean check = true;
			String str = null;
			while(check) {
				str = br.readLine();
				if(str==null) {
					break;
				}
				String [] st = str.split("-");
				Member member = new Member();
				member.setGuild(st[0]);
				member.setName(st[1]);
				member.setAge(Integer.parseInt(st[2]));
				member.setGrade(st[3]);
				member.setType(st[4]);
				ar.add(member);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return ar;
	}

}
