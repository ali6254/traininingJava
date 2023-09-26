package stringconsole;

public class ReplaceAllDemo {

	public static void main(String args[]) {
		
		String str1 ="Java123is456fun";
		//String regex for sequence of digits
		String regex ="\\d+";
		//replace all occurrences of numeric
		// digits  by a space
		System.out.println(str1.replaceAll(regex, " "));
	}
	
}
