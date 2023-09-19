package projectweek2;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height");
		//read input from the keyboard
		int  height = input.nextInt();
		
		System.out.print("Enter the width");
		//read input from the keyboard
		int  width = input.nextInt();
		
		System.out.println("area of this rectangle is "+height*width);
		// close the canner
		
		input.close();

	}

}
