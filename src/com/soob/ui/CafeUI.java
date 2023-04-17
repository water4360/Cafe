package com.soob.ui;

import java.util.Scanner;

public class CafeUI extends BaseUI {
	

	public int menu() {
		
		//메뉴만 보여주는 곳
		System.out.println("*** 별다방  ***");
		System.out.println("1. 전체주문 조회");
		System.out.println("2. 주문번호 조회");
		System.out.println("3. 메뉴 주문");
		System.out.println("4. 주문 수정");
		System.out.println("5. 주문 취소");
		System.out.println("0. 나가기");
		System.out.print("메뉴를 고르세요 >> ");
		
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine());
		
	}
	
	@Override
	public void execute() throws Exception{
		
//		ICafeUI ui = new ICafeUI(); //이렇게는 안된다는 얘기.
		ICafeUI ui = null; //하지만 구현한 클래스의 객체를 받는 것은 가능
		
		while(true) {
			switch(menu()) {
			case 1 :
				System.out.println("<전체주문 조회>");
//				new OrderEntireUI().execute();
				ui = new AllOrderUI();
				break;
			case 2 :
				System.out.println("<현재주문 조회>");
//				new OrderCheckUI().execute();
				ui = new OrderCheckUI();
				break;
			case 3 :
				System.out.println("<메뉴 주문>");
//				new OrderUI().execute();
				ui = new OrderUI();
				break;
			case 4 :
				System.out.println("<주문 수정>");
//				new OrderUpdateUI().execute();
//				ui = new OrderUpdateUI();
				break;
			case 5 : 
				System.out.println("<주문 취소>");
//				new OrderCancelUI().execute();
//				ui = new OrderCancelUI();
				break;
			case 0 : 
				System.out.println("<나가기>");
//				new ExitUI().execute();
				ui = new ExitUI();
				break;
			default :
				System.out.println("잘못 선택하셨습니다.");
				break;
			}
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}

}
