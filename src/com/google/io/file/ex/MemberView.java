package com.google.io.file.ex;

import java.util.ArrayList;

public class MemberView {

	public void view(ArrayList<Member> ar) {
		for(Member m:ar) {
		System.out.println("Guild : "+ m.getGuild());
		System.out.println("Name : "+m.getName());
		System.out.println("Age : "+m.getAge() );
		System.out.println("Grade : "+m.getGrade());
		System.out.println("Type : "+m.getType());
		System.out.println("===================");
		}
	}

}
