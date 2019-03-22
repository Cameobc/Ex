
public class Ex_02 {
	public static void main(String[] args) {    //if문 사용해서 만들기
		int i=0;
		for(i=1;i<101;i++) {
			if(i%2 !=0) {
			System.out.println(i);
			}
		}
			
}
}


//1부터 100사이의 숫자 중에
//1,3,5,...,99출력
//홀수만
//for 문 안에 값을 짝수인지 아닌지 판단하는 것이 필요
//~한다면
//1. for문 안에 if 사용해서 풀어보기
//2. if, switch case를 사용하지 않고 풀어보기