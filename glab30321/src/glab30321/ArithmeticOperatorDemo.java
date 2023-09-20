package glab30321;

public class ArithmeticOperatorDemo {

	public static void main(String args[]) {

		int x, y = 10, z = 5;
		x = y + z;
		System.out.println("+ operator resulted in " + x);
		x = y - z;
		System.out.println("- operator resulted in " + x);
		x = y * z;
		System.out.println("* operator resulted in " + x);
		x = y / z;
		System.out.println("/ operator resulted in " + x);
		x = y % z;
		System.out.println("% operator resulted in " + x);
		x = y++;
		System.out.println("Postfix ++ operator resulted in " + x);
		x = ++z;
		System.out.println("Prefix ++ operator resulted in " + x);
		x = -y;
		System.out.println("Unary -y operator resulted in " + x);
		// some examples of special cases
		int tooBig = Integer.MAX_VALUE + 1;//
		System.out.println(tooBig + " tooBig : -2147483648 which is the Integer MIN.VALUE ");
		int tooSmall = Integer.MIN_VALUE - 1; //
		System.out.println(tooSmall + " toosmall : 2147483647 which is the Integer Max.VALUE");
		System.out.println(4.0/0.0+" : INf");
		System.out.println(-4.0/0.0+" : -INF");
		System.out.println(0.0/0.0 +" : NAN");
		double d1 =12/8;
		System.out.println("d1 = 12/8 becomes 1.0 , by integer division  : "+d1);
		double d2 =12/8.0;
		System.out.println("the results of 12.0f/8 is "+d2);
		
		String message =100 +"Messages";
        System.out.println(message);
	}
}