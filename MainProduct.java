package com.product;

public class MainProduct {
	public static void main(String[] args) {
		Product p=new Product();
		
		p.setProductId(1013);
		p.setProductName("Fridge");
		p.setProductPrice(20000);
		
		int id=p.getProductId();
		System.out.println("ProductId:"+id);
		String name=p.getProductName();
		System.out.println("ProductName:"+name);
		double Salary=p.getProductPrice();
		System.out.println("ProductPrice:"+Salary);
	}

}
