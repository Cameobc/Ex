import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		//로그인 기회 4번
		//성공하면 로그인 성공/실패하면 로그인 실패
		//로그인 성공시에는 선택 3개
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int check = 0;
		String result = "가까운 은행을 방문하세요.";
		//원래 아이디랑 비밀번호
		for(int i=1;i<3;i++){
			System.out.println("아이디를 입력하세요.");
			int nId=sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int nPw=sc.nextInt();
			if(id==nId && pw==nPw) {
				check=1;
				result ="로그인 성공";
				break;
			}
		}
		
		System.out.println(result);
		if(check==1) {
			System.out.println("업무를 선택하세요.");
			System.out.println("1.계좌이체 2.통장정리 3.인   출 4.입금확인");
			int select=sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("계좌이체를 실행합니다.");
				break;
			case 2:
				System.out.println("통장정리를 실행합니다.");
				break;
			case 3:
				System.out.println("인    출을 실행합니다.");
				default:
					System.out.println("입금확인을 실행합니다.");
			}
		}
	}

}
