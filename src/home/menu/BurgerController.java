package home.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class BurgerController {
	private BurgerInfo bi;
	private Scanner sc;
	private BurgerView bv;

	public BurgerController() {
		bi = new BurgerInfo();
		sc = new Scanner(System.in);
		bv = new BurgerView();
	}

	public void start() {
		ArrayList<Burger> ar = new ArrayList<Burger>();
		ArrayList<Burger> ar2 = new ArrayList<Burger>();
		ar = bi.burgerInif();
		boolean check = true;
		int select = 0;
			while(check){
			for(int i=0; i<ar.size(); i++) {
				System.out.print(i+1+"번. "+ar.get(i).getMenu()+"\t"+ar.get(i).getPrice()+"원\n");
			}
			System.out.println("메뉴를 선택하세요.");
			select = sc.nextInt();
			if(select<=ar.size()) {
				System.out.println(ar.get(select-1).getMenu()+"를 선택하셨습니다.");
				System.out.println("수량은 ?");
				ar2.add(e) = sc.nextInt();
				System.out.println(num+"개 주문하셨습니다.");
				sum = sum +ar.get(select-1).getPrice()*num;
				System.out.println("추가 주문하시겠습니까?(y/n)");
				String choice = sc.next();
				if(choice.equals("n")) {
					check=!check;
				}
			}
			System.out.println("* 주문하신 정보는 다음과 같습니다. *");
			System.out.println("-----------------------------------------------");
		}
	}

}
