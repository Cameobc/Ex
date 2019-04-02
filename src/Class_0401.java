import java.util.Scanner;

public class Class_0401 {

	public void ex1() {
		String name = "Mississippi";
		//원하는 문자열의 개수를 출력하는 것이 목표. 일단은 s의 개수를 알아보자.
		int count = 0;
		int i =-1;
		int a = name.lastIndexOf("i");
		System.out.println(a);
		while(true) {
			i = name.indexOf("s", i+1);
			if(i!=-1) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);

	}

	public void ex2() {
		//id 입력 - 이메일 형식, @가 들어가도록/ 최대 10글자 이하로만 10글자가 넘어가면 다시 입력하세요 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하세요.");
		String id = sc.next();
		int a = id.indexOf("@");
		int b = id.length();
		if(b<11 && a !=-1) {
			System.out.println("입력 성공");
		}else {
			System.out.println("다시 입력");
		}
	}

	public void ex3() {
		//jpg, png, gif
		//업로드 할 파일명 입력->이미지 파일인지 아닌지 구별. 아닐 시엔 이미지 파일을 올려주세요. 출력 
		Scanner sc = new Scanner(System.in);
		System.out.println("업로드 할 파일명을 입력하세요.");
		String file = sc.next();
		int count = file.lastIndexOf(".");
		String a = file.substring(count+1);
		if(a.equals("jpg")||a.equals("png") || a.equals("gif")) {
			System.out.println("확장자 : "+a+" 업로드 성공!");
		}else {
			System.out.println("파일의 확장자를 확인해주세요.");
		}
	}

	public void ex4() {
		//주민번호 입력받기
		//1. 나이가 몇인지  99=20, 01=18 현재년도-태어난년도
		//구별법 뒷자리 첫번째 숫자임.
		//2. 3~5 : 봄 , 6~8 : 여름. 9~11 : 가을, 12~2 : 겨울		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요.");
		String id = sc.next();
		String a = id.substring(0, 2);
		String b = id.substring(7, 8);
		int year = Integer.parseInt(a);
		int sung = Integer.parseInt(b);
		if(sung==1||sung==2) {
			System.out.println("Age : "+(2019-(1900+year)));
		}else {
			System.out.println("Age : "+(2019-(2000+year)));
		}
		String mon = id.substring(2, 4);
		int month = Integer.parseInt(mon);
		if(month>=3 && month<=6 ) {
			System.out.println("Spring");
		}else if(month>=6 && month<=8) {
			System.out.println("Summer");
		}else if(month>=9 && month<=11) {
			System.out.println("Fall");
		}else {
			System.out.println("Winter");
		}

	}



	public static void main(String[] args) {
		Class_0401 e = new Class_0401();
		e.ex4();
	}

}
