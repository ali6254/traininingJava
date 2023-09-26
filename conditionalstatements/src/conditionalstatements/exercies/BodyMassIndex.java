package conditionalstatements.exercies;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df= new DecimalFormat("00.00");
		Scanner input = new  Scanner(System.in);
		
		System.out.println("please enter  your weight");
		double weight = input.nextDouble();
		
		System.out.println("please enter your height");
		double height= input.nextDouble();
		
		//double bmi = weight/(height*height);
		double  bmi=18.49999;
		if (bmi<=0)
			System.out.println("Error! Your Weight and Height should more than zero to be able to Interpretation");
		else if (bmi <18.5)
			System.out.println("\nThe Body Mass Index (BMI) is : "+df.format(bmi)
			+" kg/m2 \nYour Interpretaion is : UnderWeight");
		else if (bmi<25.0)
			System.out.println("\nThe Body Mass Index (BMI) is : "+df.format(bmi) 
			+" kg/m2 \nYour Interpretaion is : Normal");
		else if (bmi<30.0)
			System.out.println("\nThe Body Mass Index (BMI) is : "+df.format(bmi)
			+" kg/m2 \nYour Interpretaion is : Overweight");
		else System.out.println("\nThe Body Mass Index (BMI) is : "+df.format(bmi) 
		+" kg/m2 \nYour Interpretaion is : Obese");
		
		
	}

}
