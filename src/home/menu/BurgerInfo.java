package home.menu;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class BurgerInfo {
	private String info;
	
	public BurgerInfo() {
		info = "불고기버거, 3500, 치킨버거, 3200, 감자튀김, 1000, 치즈스틱,"
				+ "400, 샐러드, 2000, 콜라, 700, 에이드, 1200, 커피, 1000";
	}

	public void burgermenu() {

	}


	public ArrayList<Burger> burgerInif() {
		
		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<Burger> ar = new ArrayList<Burger>();
		while(st.hasMoreTokens()) {
			Burger burger = new Burger();
			burger.setMenu(st.nextToken().trim());
			burger.setPrice(Integer.parseInt(st.nextToken().trim()));
			ar.add(burger);
		}
		return ar;
	}
}
