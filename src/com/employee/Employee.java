package com.employee;

public class Employee {
	private int emp_id = 100;
	String emp_name = "Hemanth";
	protected String emp_email = "Hello@gmail.com";
	public int salary = 100000;
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.emp_id);
		System.out.println(e.emp_name);
		System.out.println(e.emp_email);
		System.out.println(e.salary);
	}

}
