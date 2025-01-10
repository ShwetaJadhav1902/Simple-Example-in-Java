package com.fruit;

public class MainFruit {
	public static void main(String[] args) {
		Fruit f=new Fruit();
		
		f.setFruitColor("Yellow");
		f.setFruitName("Mango");
		f.setFruitTaste("Sweet");
		
		
		String color=f.getFruitColor();
		System.out.println("Fruit color is "+color);
		String name=f.getFruitName();
		System.out.println("The Fruit King is "+name);
		String taste=f.getFruitTaste();
		System.out.println("Taste is very "+taste);
		
		
		
	}

}
