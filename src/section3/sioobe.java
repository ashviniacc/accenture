package section3;

public class sioobe {
	public static void main(String[] args) {
		String s1="velocity";
		try {
		System.out.println(s1.charAt(8));//we r tyimng to feth data which is not present
	}
		catch(StringIndexOutOfBoundsException a) {
			System.out.println("Idiot there is no data u trying to fetch");
		}


	}

	}

