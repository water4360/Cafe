package com.soob.ui;

public class OrderCheckUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		int orderNo = scanInt("주문 번호를 입력하세요");
		
		System.out.println("-------------------------------");
		System.out.println("   주문번호 : " + orderNo);
		System.out.println("   주문메뉴 : ");
		System.out.println("   주문수량 : ");
		System.out.println("   가   격 : ");
		System.out.println("-------------------------------");
		
	}

}
