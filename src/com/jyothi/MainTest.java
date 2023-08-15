package com.jyothi;

public class MainTest {

	public static void main(String[] args) {

		BaseFirstClass landing = new LandingClass();

		BaseFirstClass shoping = new ShopClass();

		testOpenPage(landing);
//		testOpenPage(shoping);

		final String one = "Hello";
		String two = "Hello";
		
		
		String three = new String("Hello");
		
		three = "world";
//		
//		System.out.println(three);
//		System.out.println(one == two);
//		System.out.println(one == three);
//		System.out.println(one.equals(two));
//		
//		System.out.println(two.equals(three));

		System.out.println(three);
	}

	private static void testOpenPage(BaseFirstClass object) {
		object.open();
		int a = 10;
		try {
			a = 1 / 0;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println(a);
			System.out.println("finally");
		}

	}
}
