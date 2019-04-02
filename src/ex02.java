import java.util.*;

public class ex02 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int input;
		boolean flag = false;

		System.out.print("입력 : ");
		input = in.nextInt();

		for(int i = 1; i < input; i ++) {
			if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println("출력 : " + i);
				flag = true;
				break;
			}
		}

		if(flag == false) {
			System.out.println("출력 결과가 없습니다.");
		}
		System.out.println("반복문을 마쳤습니다.");
	}
}
