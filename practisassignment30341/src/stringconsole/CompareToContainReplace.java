package stringconsole;

//import javax.print.DocFlavor.STRING;

public class CompareToContainReplace {
	
	public static void main(String args[]) {
	String s1="hellohajkkigukakjkhkkka";
	String s5="HELLO";
	String s2="hello";
	String s3="hemlo";
	String s4="flag";
	System.out.println("compare hello to hello gives "+ s1.compareTo(s2));
	System.out.println("compare hello to hello "+s1.codePointAt(0)+"and"+ s2.codePointAt(0));
//	
	System.out.println("compare hello to HELLO gives "+ s1.compareTo(s5));
	System.out.println("compare hello to HELLO   "+s1.codePointAt(0)+"and"+ s5.codePointAt(0));
//	
//	
	System.out.println("compare hello to hemlo gives "+ s1.compareTo(s3));
	System.out.println("compare hello to hemlo   "+s1.codePointAt(2)+"and"+ s3.codePointAt(2));
	
	String s7 = s1.substring(2, 7);
	CharSequence s8 = s1.subSequence(2, 7);
	int in =s1.lastIndexOf('a');
	System.out.println("index a letter in "+s1+" is : "+in);
	System.out.println("substring of s1 is : "+s7);
	System.out.println("substring of s1 is : "+s8);
	boolean b =s1.contains(s7);System.out.println(b);
	String str =s1.replace(s7, "sf");System.out.println(str);
	String str1 =s1.replace(s8, "sfsfllf");System.out.println(str1);
	
	}
}
