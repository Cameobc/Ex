
	import java.util.Scanner;

	public class Ex_07{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int id =1234;
			int pw=5678;
			int check =0;  //boolean check = false;
			String result ="가까운 은행에 방문하세요.";
			for(int i =0;i<5;i++) {
				System.out.println("아이디를 입력하세요.");
				int nId = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int nPw = sc.nextInt();
	
				if(id==nId && pw==nPw) {
					check=1;  //chcek=true; / check=!check;
					result ="로그인 성공";	
					break;
				}	
			}	
			System.out.println(result);
			
			if(check==1) {   //if(check)
			System.out.println("1.계좌조회, 2.계좌이체, 3.대  줄");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("계좌조회를 실행합니다.");
				break;
			case 2:
				System.out.println("계좌이체를 실행합니다.");
			default:
				System.out.println("대     출을 실행합니다.");
			}
			}
		}
			
}
	
			
		
			
			//최대 5번의 로그인 기회
			//로그인 성공 or 가까운 은행을 방문하세요.
			//1.계좌조회
			//2.계좌이체
			//3. 대출