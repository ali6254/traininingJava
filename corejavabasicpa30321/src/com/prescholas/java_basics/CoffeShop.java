package com.prescholas.java_basics;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CoffeShop {
	
	
	List<Product> products = new ArrayList<>();
	
	public void setupProduct() {
		Product coffe =new Product("coffe",5.44);
		Product tea =new Product("tea",4.33);
		Product cookie =new Product("cookie",5.73);
		products.add(coffe);
	    products.add(tea);
	    products.add(cookie);
	    printProduct(coffe);
	    
	}

	
	public void printProduct(Product product) {
		System.out.println("Product name : "+ 
	product.getName()+
	" and price "+product.getPrice());
	    
	}
	
	public void printallproduct() {
		for (Product product : products) {
			printProduct(product);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeShop cf =new CoffeShop();
		cf.setupProduct();
		cf.printallproduct();
		//cf.printProduct(1);
		
		//DecimalFormat df =new DecimalFormat("$#.##0,00");
		//DecimalFormat df1 = new DecimalFormat("#.##0.00");
		//coffeshop program
		double coffe =25.44d;
		double tea =4.33d;
		double cookie =6.73d;
		
		double subTotal =0;
		
		subTotal= subTotal +(coffe *134);
		subTotal= subTotal +(tea*1653);
		subTotal= subTotal +(cookie*152);
		
		//System.out.println("subtotal  : " +df1.format(subTotal));
		System.out.println("subtotal  : " +(subTotal));
		double salesTax= subTotal*0.10;
		//System.out.println("salesTax  : " +df1.format(salesTax));
		System.out.println("salesTax  : " +(salesTax));
		
		double totalSale =subTotal+salesTax;
		System.out.println("totalSale : " +(totalSale));
		
	
	
	
}}
