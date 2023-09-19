package projectweek2;

public class ConditionalOperators {

	public static void main(String[] args) {

		boolean conditionOne = true;
		boolean conditionTwo = false;

		if (conditionOne && conditionTwo) {
			// do somthing only if both variables are true
			System.out.println("both variables are true");
		}
		if (conditionOne || conditionTwo) {
			// do somthing if one or both variables are true
			System.out.println("Either or both variables are true");

		}

		if (!(conditionOne && conditionTwo)) {
			// do somthing if neither is true
			System.out.println("both variables are true1");
		}
		if (!conditionOne && !conditionTwo) {
			// do somthing rong
			System.out.println("both variables are true2");
		}

		int x = 10;
		if (x > 3 && x < 20) {
			// do somthing if neither is true
			System.out.println("x is between 3 and 20");
		}

		int y = 10;
		if (y % 2 == 1) {
			// do somthing if neither is true
			System.out.println(y + " is an odd number");
		} else {
			System.out.println(y + " is an even number");

		}

	}

}
