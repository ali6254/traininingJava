package com.prescholas.java_basics;

import java.text.DecimalFormat;

public class PracticeAassign30321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df =new DecimalFormat("$#,##0,00");
		//coffeshop program
		double coffee =5.44d;
		double tea =4.33d;
		double cookie =6.73d;
		
		double subTotal =0;
		
		subTotal= coffee*1;
		subTotal=+(tea*1);
		subTotal=+(cookie*1);
		
		System.out.println("subtotal  : " +df.format(subTotal));
		
		double salesTax= subTotal*0.10;
		System.out.println("salesTax  : " +df.format(salesTax));
		
		double totalSale =subTotal+salesTax;
		System.out.println("totalSale : " +df.format(totalSale));
		
		

	}
	
	
	

}
