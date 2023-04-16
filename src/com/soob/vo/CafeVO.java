package com.soob.vo;

public class CafeVO {
	
	//VO가 가지는 멤버변수명 = SQL상의 컬럼명
	private int orderNo; //주문번호
	private String menuName; //메뉴명 - 근데 얘도 나중에 클래스로 빠져야 할듯.
	private int price; //메뉴별 가격
	private int num; //메뉴별 수량
	private int sum; //총 합계만.
	
	
	
	
	
	public CafeVO() {
		super();
	}
	
	public CafeVO(int orderNo, String menuName, int price) {
		super();
		this.orderNo = orderNo;
		this.menuName = menuName;
		this.price = price;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "CafeVO [orderNo=" + orderNo + ", menuName=" + menuName + ", price=" + price + ", num=" + num + "]";
	}
	
	
	



	
	
}

