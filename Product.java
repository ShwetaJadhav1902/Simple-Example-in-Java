package com.product;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int id) {
		productId=id;
	}
	public String getProductName() {
		return productName;
	}
    public void setProductName(String name) {
    	productName=name;
    }
    public double getProductPrice() {
    	return productPrice;
    }
    public void setProductPrice(double price) {
    	productPrice=price;
    }

}
