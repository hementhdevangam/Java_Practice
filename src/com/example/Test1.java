package com.example;

public class Test1 {
	int nu=20;
	static int num =20;
	static final int num1 =200;
	static int res=400;
	static {
		System.out.println("From Static block");//It will execute first when class is loaded..
	}
	public static void main(String[] args) {
		
		System.out.println("Message from main");
		System.out.println("Value is:"+ num);
		num=30;
		System.out.println(num);
		//num1=400; we cant change the value which s initialize through final keywod..
		System.out.println(num1);
		System.out.println(Test1.res);//using class name we call variable..
	}

}
