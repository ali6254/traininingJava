package stringconsole;

import java.util.Arrays;

public class SlplitDemo {

	
	public static void main(String args[]) {
		
		
		String vowels="::a::b::c::d:e::";
		//splitting the string at "::"
		//storing the results in an array of strings
		String[] result= vowels.split("::");
	
		//converting array to string and printing it:
		System.out.println("results = "+Arrays.toString(result));
		int l = result.length;
		System.out.println(l);
	}
}
