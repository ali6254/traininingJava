package conditionalstatements.exercies;

import java.util.Scanner;

public class LeapYear {
	
	public static void main (String args[]) {
     
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter the year : ");
		int year = input.nextInt();
		
		if ((((year%4)==0)&&((year%100)!=0))||(year%400==0))
		System.out.println("the year:  "+year+"is leap year");
		else
			System.out.println("the year:  "+year+"is not leap year");
 }
}