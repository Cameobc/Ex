package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
//	private int num = 0;
//	private int bBurger =0;
//	private int cBurger = 0;
//	private int fries =0;
//	private int che = 0;
//	private int salad = 0;
//	private int coke =0;
//	private int ade = 0;
//	private int coffee = 0;
	
	public void selectMenu() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int num = 0;
		int bBurger =0;
		int cBurger = 0;
		int fries =0;
		int che = 0;
		int salad = 0;
		int coke =0;
		int ade = 0;
		int coffee = 0;
		while(check) {
		System.out.println("*** 메뉴를 선택하세요 ***");
		System.out.println("햄버거 ***************");
		System.out.println("1. 불고기버거	3500원");
		System.out.println("2. 치킨버거	3200원");
		System.out.println("추가 ****************");
		System.out.println("3. 감자튀김	1000원");
		System.out.println("4. 치즈스틱	400원");
		System.out.println("5. 샐러드		2000원");
		System.out.println("음료수 ***************");
		System.out.println("6. 콜라		700원");
		System.out.println("7. 에이드		1200원");
		System.out.println("8. 커피		1000원");
		System.out.println("********************");
		System.out.println("메뉴를 선택하세요.");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("불고기버거를 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			bBurger = bBurger+num*3500;
			break;
		case 2:
			System.out.println("치킨버거를 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			cBurger = cBurger+num*3200;
			break;
		case 3:
			System.out.println("감자튀김을 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			fries = fries+num*1000;
			break;
		case 4:
			System.out.println("치즈스틱을 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			che = che+num*400;
			break;
		case 5:
			System.out.println("샐러드를 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			salad = salad+num*2000;
			break;
		case 6:
			System.out.println("콜라를 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			coke = coke+num*700;
			break;
		case 7:
			System.out.println("에이드를 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			ade = ade+num*1200;
			break;
		case 8:
			System.out.println("커피를 선택하셨습니다.");
			System.out.println("수량은?");
			num = sc.nextInt();
			System.out.println(num+"개 주문하셨습니다.");
			coffee = coffee+num*1000;
			break;
			default:
				System.out.println("잘못 입력했습니다.");
		}
		System.out.println("추가 주문하시겠습니까?(y/n)");
		String choice = sc.next();
		if(choice.equals("n")||choice.equals("N")) {
			check=!check;
		}
		}//while
		int hap = bBurger+cBurger+fries+che+salad+coke+ade+coffee;
		System.out.println("* 주문하신 정보는 다음과 같습니다. *");
		System.out.println("-----------------------------------------------");
		if(bBurger>0)
			System.out.println("불고기버거 : "+num+"개 - "+bBurger+"원");
		if(cBurger>0)
			System.out.println("치킨버거 : "+num+"개 - "+cBurger+"원");
		if(fries>0)
			System.out.println("감자튀김 : "+num+"개 - "+fries+"원");
		if(che>0)
			System.out.println("치즈스틱 : "+num+"개 - "+che+"원");
		if(salad>0)
			System.out.println("샐러드 : "+num+"개 - "+salad+"원");
		if(coke>0)
			System.out.println("콜라 : "+num+"개 - "+coke+"원");
		if(ade>0)
			System.out.println("에이드 : "+num+"개 - "+ade+"원");
		if(coffee>0)
			System.out.println("커피 : "+num+"개 - "+coffee+"원");
		System.out.println("-----------------------------------------------");
		System.out.println("총 가격 : "+hap+"원");
			
		
		
	}

}
