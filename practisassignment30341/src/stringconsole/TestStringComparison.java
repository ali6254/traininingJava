package stringconsole;

public class TestStringComparison {
	
	
	public static void main(String args[]) {
		
		String s1="Am AI Engineer";
		String s2="Am AI Engineer";
		String s3= new String("Am AI Engineer");
		String s4="AI Software developer";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
	}

}
