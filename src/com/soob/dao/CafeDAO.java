package com.soob.dao;

import java.util.ArrayList;
import java.util.List;

import com.soob.vo.CafeVO;

public class CafeDAO {

	private List<CafeVO> cafeList;
	
	public CafeDAO() {
		cafeList = new ArrayList<>();
	}
	
	public void insertOrder(CafeVO c) {
		cafeList.add(c);
	}
	
	//List에 담긴 내용을 보고싶으면?
	public void getOrder(CafeVO c) {
		int i = 0;
		while(i < cafeList.size()) {
			cafeList.get(i++);
		}
		
	}

}
