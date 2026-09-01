import java.util.Scanner;

public class evennum {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	
	int a = s.nextInt();

	if (a % 2 == 0) {

		System.out.println( a + " is an even number");
			}
	
	if ( a > 0 ) {
			
		System.out.println( a + " is a positive number");
		}

	s.close();
}

} 