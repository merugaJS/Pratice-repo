package com.jyothi;

public class LoginPage extends BasePage{

	

	public LoginPage(int element) {
		super(element);
		}

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		
				
				lp.navigatToBack();
				
				lp.customClick(2);
	}
}
