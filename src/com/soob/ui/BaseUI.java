package com.soob.ui;

import java.util.Scanner;

public abstract class BaseUI implements IBoardUI{
	//UI의 모든 메뉴에서 사용자 입력을 받으므로
	//"스캐너 상속용도"
	private Scanner sc;
	
	public BaseUI() {
		sc = new Scanner(System.in);
	}
	
	
	
}
