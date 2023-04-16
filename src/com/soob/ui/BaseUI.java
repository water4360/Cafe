package com.soob.ui;

import java.util.Scanner;

import com.soob.dao.CafeDAO;

public abstract class BaseUI implements ICafeUI{
	
	//UI의 모든 메뉴에서 사용자 입력을 받으므로
	//"스캐너 상속용도" + ui 묶어주기
	private Scanner sc;
	protected CafeDAO cafeDao;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		cafeDao = new CafeDAO();
	}
	
	//문자열 입력받기
	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	//정수 입력받기
	protected int scanInt(String msg) {
		System.out.print(msg);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}
	
	
	
}
