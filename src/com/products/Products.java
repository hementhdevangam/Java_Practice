package com.products;

public class Products {
	private int product_id =  10;
	String product_name= "Laptop";
	protected int product_qty=30;
	public int product_warrenty=3;
	public static void main(String[] args) {
		Products p=new Products();
		System.out.println(p.product_id);
		System.out.println(p.product_name);
		System.out.println(p.product_qty);
		System.out.println(p.product_warrenty);
	}

}
