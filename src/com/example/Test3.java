package com.example;
import java.util.Scanner;
public class Test3{
	static Scanner sc = new Scanner(System.in);
	int nu= sc.nextInt();
	static int num =sc.nextInt();
	static final int num1 =sc.nextInt();
	static int res=sc.nextInt();
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
