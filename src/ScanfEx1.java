import java.util.*;
public class ScanfEx1 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
//		String input = scanner.nextLine();
//		int num=Integer.parseInt(input);
//		System.out.println(num);
		
		 public static void main(String[] args) {
	         // TODO Auto-generated method stub

	         Scanner sc = new Scanner(System.in);

	         int bBuger = 0;
	         int cBuger = 0;
	         int potato = 0;
	         int salad = 0;
	         int count = 0;// 수량
	         int total=0;//총합계
	         int sum = bBuger + cBuger + potato + salad;
	         boolean check = true; // 반복문의 조건	

	    

	         while (check) {
	            System.out.println("햄버거" + "**************");
	            System.out.println("1.불고기버거" + "\t" + "3500원");
	            System.out.println("2.치킨버거" + "\t" + "3200원");
	            System.out.println("추가" + "**************");
	            System.out.println("3.감자튀김" + "\t" + "1000원");
	            System.out.println("4.샐러드" + "\t" + "2000원");
	            System.out.println("메뉴선택?");

	            int select = sc.nextInt();
	            System.out.println("수량을 입력하세요");
	            count = sc.nextInt();// 수량

	            switch (select) {
	            
	            case 1:
	               System.out.println("1.불고기버거" + "\t" + "3500원");
	               bBuger = bBuger + count * 3500;
	               break;
	            case 2:
	               System.out.println("2.치킨버거" + "\t" + "3200원");
	               cBuger = cBuger + count * 3200;
	               break;
	            case 3:
	               System.out.println("3.감자튀김" + "\t" + "1000원");
	               potato = potato + count * 1000;
	               break;
	            case 4:
	               System.out.println("4.샐러드" + "\t" + "2000원");
	               salad = salad + count * 2000;
	               break;

	            default:
	               break;
	            }
	            System.out.println("추가 주문 하시겠습니까 1/0?");
	            select = sc.nextInt();
	            if (select == 0) {
	               break;
	            }
//	            while(select!=0);
//	         }//
	         }
	          total=bBuger+cBuger+potato+salad;
	         if(bBuger>0) {
	        	 int p = bBuger/3500;
	        	 System.out.println("불고기 : "+p+"개 --가격"+bBuger);
	         }
	         if(cBuger>0) {
	        	 int p = cBuger/3200;
	         System.out.println("치킨 :"+p+"개 --가격"+cBuger);
	         }
	         if(potato>0) {
	        	 int p = potato/1000;
	        	 System.out.println("감자튀김 : "+p+"개 --가격"+ potato);
	         }
	         if(salad>0) {
	        	 int p = salad/2000;
	        	 System.out.println("샐러드 : "+p+"개 --가격"+ salad);
	         }
	         System.out.println("==============");
	         System.out.println("총 가격 + total");
	      }// main end
	   }// class end
	


