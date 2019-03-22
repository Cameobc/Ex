
public class Ex_04 {
	public static void main(String [] args) {
		int money = 65430;
		int man = money/10000;
		int chon = (money%10000)/1000;
		int back = (money%1000)/100;
		int sib = (money%100)/10;
		
		System.out.println("money = "+money);
		System.out.println("만원 = "+man);
		System.out.println("천원 = "+chon);
		System.out.println("백원 = "+back);
		System.out.println("십원 = "+sib);
		
		
			
	}
	

}



//[문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.
//
//money = 65430원
//
//만원 = 6
//
//천원 = 5
//
//백원 = 4
//
//십원 = 3





