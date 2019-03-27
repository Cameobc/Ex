package com.itex.online;

public class Ex_01 {

	public static void main(String[] args) {
		final int score;
		score = 200;
		boolean power = true;
		byte b =127; // -128~127
		
		int oct = 010;  // 8진수이며 10진수로는 8
		int hex = 0x10;  //16진수이며 10진수로는 16
		
		long l = 10_000_000_000L;
		float f = 3.14f;
		double d = 3.14f;
		
		char  ch = 'A';
		int i = 'A';
		
		String str = "";  // 빈문자열
		String str2 = "ABCE";
		String str3 =  "123";
		String str4 = str2 + str3;
		
		System.out.println(ch);
		System.out.println(str4);
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		System.out.println(1e3);
		

	}

}
