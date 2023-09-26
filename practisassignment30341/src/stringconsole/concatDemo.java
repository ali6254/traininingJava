package stringconsole;

public class concatDemo {
	public static void main(String args[]) {
		// ---- usig conncat method------
		String str1="Learn";
		String str2 ="Java";
		System.out.println(str1.concat(str2));
		String str3 =str1+str2;
		System.out.println(str3);
		String  message= "Welcome "+"to "+ "java";
		System.out.println(message);
		String s = message + 2;
		System.out.println(s);
		String s1= s+'B';
		System.out.println(s1);
	}

}
