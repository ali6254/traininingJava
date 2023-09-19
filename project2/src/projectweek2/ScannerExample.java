package projectweek2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//creat an objet of scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name");
		//read input from the keyboard
		String name = input.nextLine();
		
		
		System.out.println("my name is "+name);
		// close the canner
		
		input.close();

	}

}
