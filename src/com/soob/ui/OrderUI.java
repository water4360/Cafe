package com.soob.ui;

import com.soob.vo.CafeVO;

public class OrderUI extends BaseUI{

	private static int no=1;
	
	@Override
	public void execute() throws Exception {
		
		String name = scanStr("메뉴를 고르세요 >> ");
		int num = scanInt("수량을 입력하세요 >> ");
		
		CafeVO menu = new CafeVO();
		
		menu.setOrderNo(no);
		menu.setMenuName(name);
		menu.setNum(num);
		menu.setPrice(num * 1000);
		
		no++; //주문번호 자동 증가
		
		//cafe시스템에 메뉴추가
		cafeDao.insertOrder(menu);
		//확인용
		System.out.println("주문메뉴 \n" + menu);
		
		//cafeDAO 리스트 전체를 확인하려면??
	}

	
}
