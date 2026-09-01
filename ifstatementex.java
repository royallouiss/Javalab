import java.util.Scanner;

public class ifstatementex {

	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	System.out.print("Enter a number: ");
	
	int a = s.nextInt();

	if ( a > 0 ){

	System.out.println(a + " is Positive Number");
	
		}

	s.close();

	}
}