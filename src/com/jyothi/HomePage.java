package com.jyothi;

public class HomePage extends BasePage{

	public HomePage(int element) {
		super(element);
	}
	
	
	public static void main(String[] args) {
		
		HomePage hm = new HomePage(20);
		
		hm.waitUntilLoaded();
		
	}

}
