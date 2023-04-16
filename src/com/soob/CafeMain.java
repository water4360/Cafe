package com.soob;

import com.soob.ui.CafeUI;

public class CafeMain {
	
	public static void main(String[] args) {
		
		try {
			new CafeUI().execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
