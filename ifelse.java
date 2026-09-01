import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter a number: ");
	
	int a = s.nextInt();

	if ( a % 5 == 0) {

		System.out.println( a + " is divisible by 5.");
	}
	else {
		System.out.println(a + " Not divisible by 5.");
	}

}

}
