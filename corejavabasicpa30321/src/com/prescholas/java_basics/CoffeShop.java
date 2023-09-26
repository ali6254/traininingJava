package com.prescholas.java_basics;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeShop {

	List<Product> products = new ArrayList<>();
	// list of items in your order
	List<Product> order = new ArrayList<>();

	// this is a class member variable to make it easier
	Scanner input = new Scanner(System.in);

	public void setupProduct() {
		Product coffe = new Product("coffe", 5.44);
		Product tea = new Product("tea", 4.33);
		Product cookie = new Product("cookie", 5.73);
		Product sandwich = new Product("chawarma", 8.73);
		products.add(coffe);
		products.add(tea);
		products.add(cookie);
		products.add(sandwich);

	}
	// printProduct(1);

	public void printProduct(Product product) {

		// todo homework : change this print only the product name + tab+ price with $
		System.out.println("Product name : " + product.getName() + "         and price " + product.getPrice());

	}
 // todo homework --display the products in the order list here
	private void printOrder() {
		for (Product ord : order) {
			printProduct(ord);
		}

	}
	public void printAllProduct() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	public void example() {

		// cf.printProduct(1);

		// DecimalFormat df =new DecimalFormat("$#.##0,00");
		// DecimalFormat df1 = new DecimalFormat("#.##0.00");
		// coffeshop program
		double coffe = 25.44d;
		double tea = 4.33d;
		double cookie = 6.73d;

		double subTotal = 0;

		subTotal = subTotal + (coffe * 134);
		subTotal = subTotal + (tea * 1653);
		subTotal = subTotal + (cookie * 152);

		// System.out.println("subtotal : " +df1.format(subTotal));
		System.out.println("subtotal  : " + (subTotal));
		double salesTax = subTotal * 0.10;
		// System.out.println("salesTax : " +df1.format(salesTax));
		System.out.println("salesTax  : " + (salesTax));

		double totalSale = subTotal + salesTax;
		System.out.println("totalSale : " + (totalSale));

	}

	public int displayMainUserMenu() {
		System.out.println("1) Print the menu items and prices");
		System.out.println("2) Add an item to your order");
		System.out.println("3) Print the items to your order");
		System.out.println("4) Checkout");

		System.out.println("5)Exit");
		System.out.println("\nWhat do you want to do");
		int select = input.nextInt();

		return select;

	}

	public void userSelectProduct() {
		System.out.println("Enter product name to order: ");
		String orderSelection = input.nextLine();

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() +
						"to your order. ");
			}
		}
	}

	public static void main(String[] args) {
		

		CoffeShop cf = new CoffeShop();
		cf.setupProduct();

		while (true) {
			//Console.Clear();
			int userSelection = cf.displayMainUserMenu();

			if (userSelection == 1) {
				cf.printAllProduct();
			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3) {
				cf.printOrder();
			}else if (userSelection ==5) {
				System.exit(0);
			}else
		
			System.out.println("User input  " + userSelection + " is unknown. Try again!");
		}

	}

	
}
