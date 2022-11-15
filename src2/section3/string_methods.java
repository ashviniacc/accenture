package section3;

public class string_methods {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="velo";
		//length()
		System.out.println(s1.length());
		//toUppercase()
		System.out.println(s1.toUpperCase());
		//toLowercase
		System.out.println(s2.toLowerCase());
		//equals()
		System.out.println(s1.equals(s2));//false
		//equalignorecase()
		System.out.println(s1.equalsIgnoreCase(s2));//true
		//contains()
		System.out.println(s1.contains(s3));//true
		System.out.println(s2.contains(s3));
		//charAt()
		System.out.println(s2.charAt(0));//V
		System.out.println(s2.charAt(1));//E
		//indexOf()
		System.out.println(s2.indexOf('Y'));//7
		System.out.println(s2.indexOf('V'));//0
		
		
	}

}
