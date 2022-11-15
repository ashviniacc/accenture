package section3;

public class try_catch_final {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println("I am from try block");;
		}
		catch(ArithmeticException monky) {
			System.out.println("Idiot enter valid denominator");
			System.out.println("exception is handled");
		}
		finally {
			System.out.println("Thank you for using ATM");
		}
	}

	}

