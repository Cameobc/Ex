import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//해외 연수 경험&토익800이상&고졸->삼성
		//해외 연수 경험or토익 800or 고졸->구글
		Scanner sc = new Scanner(System.in);
		System.out.println("맞으면 1, 아니면 2를 입력하세요.");
		System.out.println("해외 연수 경험이 있나요?");
		int y = sc.nextInt();
		System.out.println("토익점수가 800점 이상인가요?");
		int toeic = sc.nextInt();
		System.out.println("최종학력이 고등학교 졸업 어싱인가요?");
		int school = sc.nextInt();
		if(y==1 && toeic ==1 && school ==1) {
			System.out.println("삼성에 지원 가능합니다.");
		}else if(y ==1 || toeic ==1 || school ==1) {
			System.out.println("구글에 지원 가능합니다.");
		}else {
			System.out.println("지원이 불가합니다.");
			
		}
			
	}

}
