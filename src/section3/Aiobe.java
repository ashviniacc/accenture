package section3;

public class Aiobe {
public static void main(String[] args) {
	String ar[]=new String[5];
	ar[0]="Samantha";
	ar[1]="Rashmika";
	ar[2]="sai pallavi";
	ar[3]="Niveda Thomas";
	ar[4]="Kirthy suresh";
	//print the data which is not present 
	try {
	System.out.println(ar[5]);//AIOOBE
}
	catch(ArrayIndexOutOfBoundsException donky) {
		System.out.println("Idiot there is no data still u r trying to fetch it means u r waste fellow");
	}
}
}
